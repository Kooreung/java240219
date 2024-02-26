package ch04.lecture.p3while;

public class C04DoWhile {
    public static void main(String[] args) {
        System.out.println("statement1");

        boolean b = false;
        // do-while : 일단 실행시킨 후 조건을 확인한다.

        do {
            System.out.println("statement2") ;
        } while (b);

        System.out.println("statement3");
    }
}
