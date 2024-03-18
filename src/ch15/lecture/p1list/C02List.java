package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // List : 데이터의 순서(index)가 있고 중복이 허용된다.

        // String Type 의 빈 list 생성
        List<String> list1 = new ArrayList<>();

        // element (요소, 원소, 아이템) 추가 (index 0 부터 차례대로)
        list1.add("java");
        list1.add("spring");
        list1.add("react");
        list1.add("css");
        list1.add("spring");

        // element 읽기 (얻기, get) | return : Object
        String s1 = list1.get(2);
        System.out.println("s1 = " + s1);
        String s2 = list1.get(1);
        System.out.println("s2 = " + s2);
        System.out.println(list1.get(4));

        // element 검색 (contains) | return : boolean
        System.out.println("-----");
        System.out.println(list1.contains("spring")); // true
        System.out.println(list1.contains("html")); // false

        // element 삭제 (remove) | return : boolean
        System.out.println("-----");
        System.out.println(list1.remove("java")); // java 삭제 후 true return
        System.out.println(list1.remove("spring")); // 첫 번째 spring 삭제 후 true return
        System.out.println(list1.remove("html")); // false return
        System.out.println(list1.size());

        // element 전체 탐색
            // 1. 고전적 for 문
        System.out.println("-----");
        for (int i = 0 ; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

            // 2. 향상 된 for 문
        System.out.println("-----");
        for (String item : list1) {
            System.out.println(item);
        }

            // 3. forEach & Lambda
        System.out.println("-----");
        list1.forEach(System.out::println);

    }
}
