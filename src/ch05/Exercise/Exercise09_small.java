package ch05.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09_small {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score = {};
        boolean start = true;
        int sum = 0;
        double avg = 0;

        while (start) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int select = scanner.nextInt();

            if (select == 1) {
                System.out.print("학생 수> ");
                score = new int [scanner.nextInt()];
                System.out.println("학생 수가 입력 되었습니다. 학생 수는 " + score.length + "명 입니다.");
                System.out.println("");
            }

            if (select == 2) {
                for(int i = 0; i < score.length; i++) {
                    System.out.print("점수입력> ");
                    score[i] = scanner.nextInt();
                    System.out.println(score[i] + "의 점수를 입력했습니다.");
                    sum += score[i];
                }
                System.out.println("점수입력이 완료 되었습니다.");
                System.out.println("");
                avg = (double) sum / score.length;
            }

            if (select == 3) {
                System.out.println("점수리스트는 다음과 같습니다.");
                System.out.println(Arrays.toString(score));
                System.out.println("");
            }

            if (select == 4) {
                System.out.println("분석결과는 다음과 같습니다.");
                System.out.println("합계 : " + sum);
                System.out.println("평균 : " + avg);
                System.out.println("");
            }

            if (select == 5) {
                start = false;
                System.out.println("프로그램이 종료되었습니다.");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }

    }
}
