package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;

        // 구버전 스위치
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
                break;
        }

        // 스위치 익스프레션
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
    }
}
