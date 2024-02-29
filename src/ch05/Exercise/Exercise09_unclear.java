package ch05.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09_unclear {
    public static void main(String[] args) {
        Scanner selector = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int select = selector.nextInt();
            int[][] student = {};
            int scores = 0;

            if (select == 1) {
                System.out.print("학생 수> ");
                student = new int [scanner.nextInt()][];
                System.out.println("학생 수가 입력 되었습니다. 학생 수는 " + student.length + "명 입니다.");
                System.out.println("");
            }

            if (select == 2) {
                for(int i = 0; i < student.length; i++) {
                    System.out.print("점수입력> ");
                    student[i] = new int [scanner.nextInt()];
                    System.out.println(student[i] + "의 점수가 입력 되었습니다.");
                }
                System.out.println("점수입력이 완료 되었습니다.");
                System.out.println("");
            }

            System.out.println(Arrays.toString(student));
            System.out.println(student.length);
            System.out.println(Arrays.toString(student[0]));
        }



    }
}
