package ch09.sec04.exam01;

public class A {
    A() {
        // Constructor 내에서 Local Class 선언
        class B {}
        B b = new B(); // Local Object 생성
    }

    void method() {
        // Method 내에서 Local Class 선언
        class B {}
        B b = new B(); // Local Object 생성
    }
}
