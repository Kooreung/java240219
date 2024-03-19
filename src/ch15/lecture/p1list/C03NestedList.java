package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C03NestedList {
    public static void main(String[] args) {
        // Element 가 String
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");

        // Element 가 List
        List<List<String>> list2 = new ArrayList<>();
        list2.add(new ArrayList<>());
        list2.add(new ArrayList<>());

        // Element 를 넣는 두 가지 방법
        List<String> subList1 = list2.getFirst();
        subList1.add("react");
        subList1.add("vue");

        list2.get(1).add("javascript");
        list2.get(1).add("rust");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.get(0).get(1));
    }
}
