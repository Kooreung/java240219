package ch06.lecture.p2method;

import java.util.Random;

public class C09Return {
    public static void main(String[] args) {
        C09MyClass dice = new C09MyClass();
        dice.method2();

    }
}

class C09MyClass {
    void method1() {
        return;
        /* return 의 역할
        1. 메소드 종료
        2. 메소드가 호출 된 곳으로 값을 반환
            이 때, 반환되는 값의 타입이 메소드의 타입과 일치해야 한다.
         */
    }

    void method2() {
        Random random = new Random();
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println(dice1 + "," + dice2);
            if (dice1 == dice2) {
                return;
            }
        }
    }
}