package ch11.lecture.p2throw;

public class C02Throw {
    public static void main(String[] args) {

        try {
            someMethod1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }

    public static void someMethod1() {
        // if (조건문이 되었을 때)
        throw new RuntimeException();
    }
}
