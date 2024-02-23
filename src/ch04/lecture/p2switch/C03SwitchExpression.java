package ch04.lecture.p2switch;

public class C03SwitchExpression {
    public static void main(String[] args) {

        int value = 1;

        switch (value) { // switch Alt + Enter
            case 1 -> System.out.println("statement 1");
            case 2 -> System.out.println("statement 2");
            case 3 -> { //여러 명령문 넣고 싶으면 {중괄호}
                System.out.println("statement 3");
                System.out.println("statement 4");
            }
        }
    }
}
