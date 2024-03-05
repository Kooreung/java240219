package ch06.lecture.p5static;

import java.util.Arrays;
import java.util.Scanner;

public class C02Static {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 5};
        // Arrays.toString -> static 메소드
        System.out.println(Arrays.toString(arr));
    }
}
