package ch06.lecture.p6final;

public class C02Final {
    public static void main(String[] args) {
        method1(3);
        method2(5);
    }

    // 파라미터 예시
    static void method1(int i) {
        i = 10;
    }
    static void method2(final int j) {
        // j = 6; // 파라미터에 final 이 붙었으므로, 할당 불가능
    }
}
