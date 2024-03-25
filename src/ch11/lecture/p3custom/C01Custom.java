package ch11.lecture.p3custom;

public class C01Custom {
    public static void main(String[] args) {
        someMethod1();
    }

    public static void someMethod1() {
        throw new RuntimeException("잘못 된 접근입니다.");
    }
}
