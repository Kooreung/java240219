package ch04.lecture.p5break;

public class C02Continue {
    public static void main(String[] args) {
        //continue : 코드블럭 내 코드 실행을 중단하고
        //           반복문의 ( ) 로 흐름이 넘어감
        // for, while, do-while 에서만 사용

        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 != 0) {
                continue;
            }
            System.out.println("statement" + i);
        }
    }
}
