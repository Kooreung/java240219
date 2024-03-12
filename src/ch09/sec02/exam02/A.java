package ch09.sec02.exam02;

public class A {
    // Instance Nested Class
    class B {
        int field1 = 1;

        static int field2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void  method2() {
            System.out.println("B-method2 실행");
        }
    }

    // Instance Method
    void useB() {
        // B 객체 생성 후 Instance Field 및 Method 사용
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        // B Class 의 Static Field 및 Method 바로 사용
        System.out.println(B.field2);
        B.method2();
    }
}
