package c03.lecture.p3compare.C01Compare;

public class C01Compare {
    public static void main(String[] args) {
        // 비교연산자의 연산 결과 = boolean (true, false)
        // == , != , > , < , >= , <=
        // 다른 타입 간 연산 가능 (그래도 가능하다면 같은 타입끼리 연산)

        int a = 5;
        int b = 8;
        boolean c1 = a == b;
        boolean c2 = a != b;
        boolean c3 = a >= b;
        boolean c4 = a <= b;
        boolean c5 = a > b;
        boolean c6 = a < b;

        System.out.println("c = " + c1);
        System.out.println("c = " + c2);
        System.out.println("c = " + c3);
        System.out.println("c = " + c4);
        System.out.println("c = " + c5);
        System.out.println("c = " + c6);
    }
}
