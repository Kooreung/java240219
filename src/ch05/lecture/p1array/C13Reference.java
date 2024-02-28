package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 배열복사
        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 같은 메모리 번지를 참조하므로 함께 변화한다.

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);
        // 새로운 메모리 번지를 참조하게 된다.

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));
    }
}
