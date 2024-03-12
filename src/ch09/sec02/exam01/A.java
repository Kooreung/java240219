package ch09.sec02.exam01;

public class A {
    // Instance member Class
    class B {}

    // Instance field 값으로 B 객체 대입
    B field = new B();

    // Constructor
    A() {
        B b = new B();
    }

    // Method
    void method() {
        B b = new B();
    }
}
