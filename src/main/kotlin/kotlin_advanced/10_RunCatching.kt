package kotlin_advanced

fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {

//    val result = try {
//        getStr()
//    } catch (e: Exception) {
//        println(e.message)
//        "기본값"
//    }

    // runCatching 에서 제공하는 함수들
    // 1. getOrElse : 성공인 경우 getStr() 값을 반환, 아닌 경우에는 else 로직 실행
    val result = runCatching { getStr() }
        .getOrElse {
//            println(it.message)
            "기본값"
        }

    // 2. getOrNull : 성공인 경우에는 getStr() 값을 그대로 반환하고 예외가 발생하면 null을 반환
    val result2 = runCatching { "성공" }
        .getOrNull()

    // 3. exceptionOrNull : 성공인 경우에는 null 반환, 실패인 경우에는 throwable 반환
//    val result3 = runCatching { getStr() }
//        .exceptionOrNull()
//
//    result3?.let {
//        println(it.message)
//        throw it
//    }

    // 4. getOrDefault : 성공인 경우 runCatching 내의 값(getStr()) 반환하고 함수 내에서 지정한 default value 반환 (하단의 경우 "기본 값" 반환)
    val result4 = runCatching { getStr() }
        .getOrDefault("기본 값")


    val result5 = runCatching { getStr() }
        .getOrElse {
//            println(it.message)
            "기본 값2"
        }

    // 6. getOrThrow : 성공 시 getStr() 값을 그대로 반환, 실패 시 예외 발생
    val result6 = runCatching { "성공" }
        .getOrThrow()

    // 7. map : 성공 시 원하는 값으로 변경 가능
    val result7 = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }.getOrThrow()

    // 8. mapCatching : map 로직 안에서 예외 발생 시 getOrDefault 메서드를 사용해도 예외 처리가 되지 않는 경우에 사용.
    val result8 = runCatching { "안녕" }
        .mapCatching {
            throw Exception("예외")
        }.getOrDefault("기본 값")

    // 9. recover : 실패 시 원하는 값으로 변경 가능
    val result9 = runCatching { getStr() }
        .recover {
            "복구"
        }.getOrNull()

    // 10. recoverCatching : recover 로직 안에서 예외 발생 시 recoverCatching 으로 예외 처리 동작 가능
    val result10 = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }.getOrDefault("복구 완료")

    println(result10)
}

// 예외 발생 기본 값으로 초기화
// 기본값