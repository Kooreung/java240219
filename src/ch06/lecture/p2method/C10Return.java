package ch06.lecture.p2method;

import java.util.Random;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        int a = o.method1();
        int c = 10 / o.method1();
        System.out.println(a);
        System.out.println(c);

        double b = o.method2();
        double d = o.method2() * 2;
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        System.out.println("-----");

        System.out.println(o.method7(6));
        System.out.print(o.method7(45) + " | ");
        System.out.print(o.method7(45) + " | ");
        System.out.print(o.method7(45) + " | ");
        System.out.print(o.method7(45) + " | ");
        System.out.print(o.method7(45) + " | ");
        System.out.println(o.method7(45));
    }

}

class C10MyClass {
    // return
    // 호출한 곳으로 값을 반환함
    // 반환되는 값의 타입이 메소드의 타입과 일치해야함

    int method1() {
        return 5;
    }  // return 값 5는 integer, 그러므로 void 가 아닌 int 로 시작

    double method2() {
        return 3.14;
    }  // return 값 3.14는 double, 그러므로 void 가 아닌 double 로 시작

    String method3() {
        return "hello";
    }  // return 값 hello는 String, 그러므로 void 가 아닌 String 로 시작

    void method6() {
        return;
    }  // void : 반환하는 값이 없어야 함. return 을 종료로만 사용 가능

    int method7(int bound) {
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }
}