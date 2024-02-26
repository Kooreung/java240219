package ch04.lecture.p5break;

public class C01Break {
    public static void main(String[] args) {
        // for, while, do-while
        // 반복문 코드 블럭에서 break 실행 시 반복문 종료

        boolean b = true;

        while (b) {
            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");
            break;
        }
        System.out.println("statement4");
    }
}
