package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println("당신의 점수 " + score + "점은 " + grade + "등급입니다." );
    }
}
