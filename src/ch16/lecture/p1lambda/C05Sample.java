package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        C05MyInterface obj1 = (a, b) -> System.out.println(a / b);
        C05MyInterface obj2 = (a, b) -> System.out.println(a % b);
        obj1.method(5,3);
        obj2.method(5,3);
    }

}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}