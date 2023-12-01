package kotlin_basic;

public class Java_Exception {
    public static void main(String[] args) {

        try {
            System.out.println("1초 전");
            Thread.sleep(1000);
            System.out.println("1초 후");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
