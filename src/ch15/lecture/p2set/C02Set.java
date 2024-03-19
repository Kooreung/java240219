package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("spring");
        set.add("css");
        set.add("java");

        System.out.println("### 향상된 for");
        for(String item : set) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("### forEach");
        set.forEach(e -> System.out.println(e));

        System.out.println();

        System.out.println("### Iterator");
        Iterator<String> iterator = set.iterator();
        // Iterator 주요 Method
            // hasNext : 탐색 할 item 확인 | return boolean
            // next : 다음 item 을 Return
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
