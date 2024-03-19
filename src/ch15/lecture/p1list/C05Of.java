package ch15.lecture.p1list;

import java.util.List;

public class C05Of {
    public static void main(String[] args) {
        // List.of -> 수정 불가능한 Element List 객체 생성
        // 무조건 초기화에서만 설정

        List<String> list1 = List.of();
        System.out.println(list1.size());

        List<String> list2 = List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);


        List<String> list3 = List.of("react", "vue", "jsp");
        // list3.add("hello"); // 불가능
        // list3.remove(0); // 불가능
        // list3.set(0, "angular"); // 불가능
        System.out.println(list3.size());

        // 중첩 List
        List<List<Integer>> list5 = List.of(
                List.of(95, 96),
                List.of(83, 92, 96),
                List.of(78, 83, 93, 87, 88)
        );

        System.out.println(list5);

    }
}
