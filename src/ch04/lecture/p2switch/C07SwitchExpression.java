package ch04.lecture.p2switch;

public class C07SwitchExpression {
    public static void main(String[] args) {
        int angle = 90;

        int answer = 0;

        answer = switch (angle) {
            case 90 -> 2;
            case 180 -> 4;
            default -> 0;
        }; // 이는 default 가 꼭 필요하다.

        switch (angle) {
            case 90 -> answer = 2;
            case 180 -> answer = 4;
        } // 동일한 수식이나, 상단은 이를 더 간결하게 만든 것이다.

        System.out.println("answer = " + answer);
    }
}
