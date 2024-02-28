package ch05.lecture.p1array;

import java.util.Arrays;

public class C18NestedArray {
    public static void main(String[] args) {
        // 1차원 배열
        // 원소가 5개인 배열
        // 원소의 타입이 int = 정수타입
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        // 2차원 배열
        // 원소가 3개인 배열
        // 원소의 타입이 int[] = 참조타입
        int[][] arr2 = new int[3][];
        System.out.println(Arrays.toString(arr2));
        arr2[0] = new int[] {1,2,3};
        arr2[1] = new int[] {1,2,3,5,6,7,8,12,3};
        arr2[2] = new int[] {8,8,8,8,8,8,8,8};
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        // 초기값 지정해서 배열 만들기
        int[] arr3 = new int[] {5,1,3};
        int[] arr4 = {4,5,2};

        int[][] arr5 = new int[][] {{5, 3, 1, 2}, {1, 2, 3, 4}};
        int[][] arr6 = {{5, 3, 1, 2}, {1, 2, 3, 4}};
        int[][] arr7 = new int[3][];
        arr7[0] = new int[] {5,1,2};
        // arr7[1] = {불가능}
    }
}
