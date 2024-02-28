package ch05.lecture.p1array;

import java.util.Arrays;

public class C19NestedArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][];

        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));

        arr1[0] = new int [5];

        System.out.println(Arrays.toString(arr1));

        arr1[1] = new int [3];

        System.out.println(Arrays.toString(arr1));

        arr1[0][2] = 13;

        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
    }
}
