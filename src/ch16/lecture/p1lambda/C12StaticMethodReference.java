package ch16.lecture.p1lambda;

import java.util.List;

public class C12StaticMethodReference {
    public static void main(String[] args) {
        C12MyInterface obj2 = C12OtherClass::method;

        List<Integer> list = List.of(9, 10, 1, 28, 3, 27)
                .stream()
                .filter(C12OtherClass::isOdd)
                .toList();
        System.out.println(list);
    }
}

class C12OtherClass {

    static int method(int x, int y) {
        System.out.println("복잡하다 복잡해");
        return 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }
}

@FunctionalInterface
interface C12MyInterface {
    int method(int a, int b);
}