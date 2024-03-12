package ch09.lecture.p2annonymous;

public class C06AnonymousClass {
    public static void main(String[] args) {
        C01MyInterface obj = new C01MyInterface() {
            @Override
            public void method1() {
            }

            @Override
            public void method2() {
            }
        };

        obj.method1();
        obj.method2();
    }
}

interface C01MyInterface {
    void method1();
    void method2();
}