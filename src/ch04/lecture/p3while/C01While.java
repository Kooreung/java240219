package ch04.lecture.p3while;

public class C01While {
    public static void main(String[] args) {
        // while (boolean) {코드블럭}
        // { } 실행 후 다시 ( ) 실행흐름 복구
        // ( ) 이 false 이면 실행흐름이 while 후로 넘어감

        boolean condition = false;

        System.out.println("statement 1");
        while (condition) {
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        System.out.println("statement 4");
    }
}
