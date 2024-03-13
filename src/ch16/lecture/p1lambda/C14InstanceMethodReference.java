package ch16.lecture.p1lambda;

// 3. 임의 객체의 instance method 참조

public class C14InstanceMethodReference {
    public static void main(String[] args) {
        C14OtherClass obj = new C14OtherClass();
        C14MyInterface lam1 = (a, b) -> a.someMethod(b);
        C14MyInterface lam2 = C14OtherClass::someMethod;
    }
}

class C14OtherClass {
    void someMethod(int x) {
        System.out.println("머리가 아프다");
    }
}

@FunctionalInterface
interface C14MyInterface {
    void method(C14OtherClass obj, int x);
}