package ch16.lecture.p1lambda;

import java.util.Arrays;

public class C10Sample {
    public static void main(String[] args) {
        String[] names = {"son", "park", "hwang"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (b, a) -> b.length() - a.length());
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length()-1));
        System.out.println(Arrays.toString(names));


    }
}
