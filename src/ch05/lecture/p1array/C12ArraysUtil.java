package ch05.lecture.p1array;

import java.util.Arrays;

public class C12ArraysUtil {
    public static void main(String[] args) {
        // java.util.Arrays : 유틸리티 클래스
        // toString : 배열을 보기 좋게 String 으로 반환해주는 메소드
        int[] arr1 = {9, 1, 2, 5, 3, 6};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort : 배열을 오름차순으로 정렬해주는 메소드
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // fill : 특정 값으로 배열을 채우는 메소드
        int[] arr2 = new int [5];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 23);
        System.out.println(Arrays.toString(arr2));

        // copyOf : 배열을 복사하는 메소드
        int[] arr3 = {9, 3, 4, 5, 1};
        int[] arr4 = arr3;
        // 이의 경우 같은 배열이 된다.
        // 따라서 원소 값을 바꾸면 같이 반영된다.
        int[] arr5 = {3, 2, 4, 5, 6};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);
    }
}
