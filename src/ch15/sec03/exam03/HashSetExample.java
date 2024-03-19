package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            // 객체 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                // 가져 온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for(String element : set) {
            System.out.println(element);
        }
    }
}
