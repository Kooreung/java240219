package ch07.lecture.p2polymrphism;

public class C05Polymorphsim {
    A a;
    C05Polymorphsim() {
        a = new A();
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();
    }
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();

        method(new A());
        method(new B());
        method(new C());
    }

    public static void method(A a) {
        a.method1();
    }
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
    @Override
    public void method1() {
        System.out.println("C.method1");
    }
}