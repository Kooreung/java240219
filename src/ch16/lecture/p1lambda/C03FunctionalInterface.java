package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
}

// @FunctionalInterface -> False ( 0개 )
interface C03MyInterface1 {

}

@FunctionalInterface // True
interface C03MyInterface2 {
    void method1(); // 1개
}

// @FunctionalInterface -> False ( 2개 )
interface C03MyInterface3 {
    void method1();
    void method2();

}

@FunctionalInterface // True ( '추상'메소드가 1개 )
interface C03MyInterface4 {
    void method1();
    default void method2() {
    }
}

@FunctionalInterface // True ( '추상'메소드가 1개 )
interface C03MyInterface5 {
    void method1();

    // 재정의 하지 않아도 되는 Method 들
    String toString();
    int hashCode();
    boolean equals(Object o);
}