package c03.lecture.p1arithemetic;

public class C03Overflow {
    public static void main(String[] args) {

        // overflow : 산술연산 시 저장공간의 한계를 넘어 원하지 않는 값을 얻게 된다.
        int a = 2_000_000_000;
        int b = 1_000_000_000;
        int c = a + b;
    }
}
