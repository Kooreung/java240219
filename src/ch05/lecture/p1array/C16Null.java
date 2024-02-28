package ch05.lecture.p1array;

import java.util.Arrays;

public class C16Null {
    public static void main(String[] args) {
        // 배열 원소의 기본값은 0, 또는 null
        int[] arr1 = new int[3];
        double[] arr2 = new double[3];
        String[] arr3 = new String[3];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // 2차원 배열 (matrix)
        // 원소 타입과 무관하게 null 로 기본값
        int[][] arr4 = new int[4][];
        double[][] arr5 = new double[4][];
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

    }
}
