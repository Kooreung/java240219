package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 추가 add | return boolean : Element 존재하지 않을 때
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        // 크기 size
        System.out.println(set.size()); // 5

        // Element 가 없을 때만 추가 가능
        boolean b1 = set.add("css");        // true
        boolean b2 = set.add("java");       // false | 중복 | 그러나 오류는 없음
        System.out.println(set.size());     // 5

        // 검색 contains | return boolean : Element 존재하지 않을 때
        boolean b3 = set.contains("angular");   // false
        boolean b4 = set.contains("java");      // true

        // 지우기 remove | return boolean : Element 존재하지 않을 때
        set.remove("java");             // true
        set.remove("css");              // true
        System.out.println(set.size());     // 3
        set.remove("jsp");              // false | 없지만 오류는 없음
        System.out.println(set.size());     // 3
    }
}
