package ch15.lecture.p2set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("css");
        list.add("react");
        list.add("spring");
        list.add("html");

        // 고전 for, 향상 for, forEach, Iterator

        // 고전 for
        for ( int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 1) {
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("-----");

        //Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.length() % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(list);

        System.out.println("-----");
    }
}
