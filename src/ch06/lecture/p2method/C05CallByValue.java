package ch06.lecture.p2method;

import java.util.Arrays;

public class C05CallByValue {
    public static void main(String[] args) {
        C05MyClass obj1 = new C05MyClass();
        int[] a1 = new int[3];
        a1[0] = 99;
        System.out.println("a1 = " + a1); // 0
        obj1.method1(a1);
        System.out.println("a1 = " + a1); // 99

        obj1.method2(a1);
        System.out.println(Arrays.toString(a1));

        }
    }

class C05MyClass {
    void method1(int[] arr) {
        System.out.println(arr.length);
        System.out.println("arr[0] = " + arr[0]);
    }

    void method2(int[] arr) {
        arr = new int[] {-3, -5, -7};
        System.out.println(Arrays.toString(arr));
    }

}