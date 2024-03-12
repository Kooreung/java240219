package ch09.sec03.exam01;

public class A {
    // Instance member Class
    static class B {}

    // Instance field 값으로 B 객체 대입
    B field1 = new B();

    // Static field 값으로 B 객체 대입
    static B field2 = new B();

    // Constructor
    A() {
        B b = new B();
    }

    // Method
    void method1() {
        B b = new B();
    }

    // Static Method
    static void method2() {
        B b = new B();
    }
}