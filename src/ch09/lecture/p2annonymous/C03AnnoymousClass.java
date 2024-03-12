package ch09.lecture.p2annonymous;

public class C03AnnoymousClass {
    public static void main(String[] args) {
        C03Parent obj = new C03Parent() {
            // abstract method 재정의
            @Override
            void method() {
                System.out.println("C03AnnoymousClass.method");
            }
        };

        obj.method();
    }
}

abstract class C03Parent {
    abstract void method();
}

