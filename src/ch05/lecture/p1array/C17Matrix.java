package ch05.lecture.p1array;

import java.util.Arrays;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2]; // 3행 2열

        // mat1 의 원소의 갯수는 3개, 그 타입은 int []
        // mat1 의 각 원소의 원소의 갯수는 2개, 그 타입은 int

        System.out.println(mat1.length);
        System.out.println(mat1[0].length);
        System.out.println(mat1[1].length);
        System.out.println(mat1[2].length);

        mat1[1][0] = 5; // 2번째 행의 1번째 열의 값을 5로 설정

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print("[" + mat1[i][j] + "]");
                if (j != 0) {
                    System.out.println("");
                }
            }
        } // 전체 탐색은 중첩된 for 을 사용하면 좋다.

        System.out.println(Arrays.toString(mat1[1]));
    }
}
