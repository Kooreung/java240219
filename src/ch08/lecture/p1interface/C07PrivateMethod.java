package ch08.lecture.p1interface;

public interface C07PrivateMethod {
    // public static final field
    // public abstract instance method **
    // public default method
    // private instance method
    // public static method
    // private static method

    default void method1() {
        System.out.println("C07PrivateMethod.method1");
        extracted();
    }

    default void method2() {
        System.out.println("C07PrivateMethod.method2");
        extracted();
    }

    // private instance method
    private void extracted() {
        System.out.println("두 메소드의 중복된 코드");
    }

    static void method3() {
        System.out.println("C07PrivateMethod.method3");
        doCommon();
    }

    static void method4() {
        System.out.println("C07PrivateMethod.method4");
        doCommon();
    }

    private static void doCommon() { //기본적으로 public 으로 전환됐기 때문에 private 으로 보호
        System.out.println("두 스태틱 메소드의 중복된 코드");
    }
}
