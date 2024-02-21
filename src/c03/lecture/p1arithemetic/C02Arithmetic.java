package c03.lecture.p1arithemetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        /*
        증감연산자
        ++, --
        피연산자 갯수 : 1개
        연산의 결과 : 피연산자의 타입
        연산의 결과값
        1. 피연산자의 값 : 피연산자가 연산자보다 앞에 올 때
        2. (피연산자의 값 + 1) 또는 (피연산자의 값 - 1) : 피연산자가 연산자보다 뒤에 올 때

        연산 시 피연산자의 값이 1 증가 또는 1 감소
         */

        int a = 10;
        int a1 = a++;
        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);
    }
}
