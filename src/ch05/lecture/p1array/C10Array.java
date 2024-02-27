package ch05.lecture.p1array;

public class C10Array {
    public static void main(String[] args) {

        // 각 원소는 초기값 0 으로 정의 됨

        int[] arr1;
        arr1 = new int[]{1, 2, 3}; // 배열의 길이가 정의됨

        int[] arr2 = {2,3,4,5}; // 배열의 길이가 정의됨

        int[] arr3;
        arr3 = new int[3]; // 배열의 길이만 정의됨

        int[] arr4 = new int[4]; // 배열의 길이만 정의됨
        var arr5 = new int[7];

        int[] arr6 = new int [2];
        arr6 [0] = 11;
        arr6 [1] = 23;
        // arr6 [2] = 13; -> 불가능, 배열의 길이가 2만 지정되었기 때문
    }
}
