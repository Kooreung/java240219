package ch06.lecture.p5static;

import static java.util.Arrays.*;
// static import
    // 클래스 명을 생략하고 작성하기 위한 import

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        fill(brr, 100); // Arrays. 생략

        int[] crr = copyOf(arr, arr.length);  // Arrays. 생략
    }
}