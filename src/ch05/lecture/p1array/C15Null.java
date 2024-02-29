package ch05.lecture.p1array;

import java.util.Arrays;

public class C15Null {
    public static void main(String[] args) {
         // null : 참조하는 객체가 없다
         int[] arr1 = null;
         char[] arr2 = new char[4];
         // NullPointerException 예외를 기억해두기
//         System.out.println(arr1.length);
         System.out.println(Arrays.toString(arr2));

    }
}
