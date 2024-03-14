package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; // auto boxing
        // Long e = c; // 다형성
        // Long d = a; // 다른 타입 형태는 불가능 , 다형성

        Number e = a;
        Object f = a;
    }
}
