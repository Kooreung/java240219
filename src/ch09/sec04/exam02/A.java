package ch09.sec04.exam02;

public class A {
    void useB() { // Method
        class B { // Local Class
            int field1 = 1; // Instance Field
            static int field2 = 2; // Static Field

            B() {
                System.out.println("B-생성자 실행");
            } // Constructor

            void method1() {
                System.out.println("B-method1 실행");
            } // Instance Method

            static void method2() {
                System.out.println("B-method2 실행");
            } // Static Method
        }

        B b = new B(); // Local Object 생성

        // Local Object 의 Instance Field, Method 사용
        System.out.println(b.field1);
        b.method1();

        // Local Class 의 Static Field, Method 사용
        System.out.println(B.field2);
        B.method2();
    }
}
