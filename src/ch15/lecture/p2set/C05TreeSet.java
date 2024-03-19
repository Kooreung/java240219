package ch15.lecture.p2set;

import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        // TreeSet
        // Comparator || Comparable(natural ordering) 을
        // 사용해 Element 의 순서가 결정 됨

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(20);

        System.out.println(set.size());
        System.out.println(set);

    }
}
