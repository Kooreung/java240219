package ch06.lecture.p1field;

import java.util.Arrays;

public class C01Field {
    public static void main(String[] args) {
        int[] arr1 = new int [3];
        int[] arr2 = new int [5];

        System.out.println(arr1.length);
        System.out.println(arr2.length);

        System.out.println(arr1.hashCode());
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(arr2.hashCode());

        int[] arr4 = new int [3];

    }
}

