package ch06.lecture.p2method;

public class C07OverLoad {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass();
        // 메소드 호출 시 argument의 타입에 따라 실행 시킬 메소드가 결정 됨
        o1.method1();
        o1.method1(3);
        o1.method1(3.14);
        o1.method1(3.14, 4.52);
        o1.method1(3, 4.52);
        o1.method1(3.14, 4);
        o1.method1(3.14, 4, 5);
    }
}

class C07MyClass {
    // 파라미터의 갯수, 타입이 다른
    // 같은 이름의 메소드 작성 가능

    void method1() {}
    void method1(int x) {}
    void method1(double x) {}
    void method1(double x, double y) {}
    void method1(double x, double y, double z) {}
    void method1(int x, double y) {}
    void method1(double x, int y) {}
}