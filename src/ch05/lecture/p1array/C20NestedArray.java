package ch05.lecture.p1array;

public class C20NestedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9};

        int[][] arr2 = {{80, 90, 86}, {76, 88}};

        int[][] arr3 = arr2;

        arr3[0][1] = 33;

        System.out.println(arr2[0][1]);
        System.out.println(arr3[0][1]);

        arr3[1] = arr1;
        // arr3 = arr2 이다.
        // arr3의 1번 배열 원소를 arr1의 원소들로 교체했다.
        // 따라서 arr2의 1번 배열은 arr1의 원소들로 교체됐다.

        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);

    }
}
