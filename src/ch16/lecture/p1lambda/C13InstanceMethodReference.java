package ch16.lecture.p1lambda;

import java.util.List;

// 2. instance method 참조
public class C13InstanceMethodReference {
    public static void main(String[] args) {
        C13OtherClass obj = new C13OtherClass();
        C13MyInterface lambda1 = (i, j) -> obj.someMethod(i , j);
        C13MyInterface lambda2 = obj::someMethod;

        List.of(9,10,3,23,7)
                .forEach(x -> System.out.println(x));

        List.of(9,10,3,23,7)
                .forEach(System.out::println);
    }
}

class C13OtherClass {
    void someMethod(int a, int b) {
        System.out.println("복잡하다 복잡해");
    }
}

@FunctionalInterface
interface C13MyInterface {
    void method(int x, int y);
}