package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 3);

        o1.method2();
        o1.method2(5);
        o1.method2(5, 7);
        o1.method2(5, 7, 9, 11, 14, 2, 3, 5, 2);
    }

}

class C08MyClass {
    void method1() {
        System.out.println("C08MyClass.method1, 0파라");
    }
    void method1(int x) {
        System.out.println("C08MyClass.method1, 1파라");
    }
    void method1(int x, int y) {
        System.out.println("C08MyClass.method1, 2파라");
    }

    // varargs (가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 활용
    void method2(int... a) {
        System.out.println("C08MyClass.method2, 0개 이상의 파라미터");
        System.out.println(a.length);
    }

    // 다른 파라미터와 함께 사용 시 가변인자는 마지막에 넣어야 한다.
    void method3(int x, int... y) {}
    void method4(String x, int y, int... z) {}
}
