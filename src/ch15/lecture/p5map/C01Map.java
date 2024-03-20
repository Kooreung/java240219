package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map  : entry (key, value) 를 저장
        // 같은 key 를 가진 두 개의 entry 를 중복 저장 할 수 없음
        // map 같은 구조 = dictionary (key, value)

        Map<String,String> map = new HashMap<>();

        // entry 추가 Method
        map.put("java","programming language");
        map.put("css","style sheet");
        map.put("html","hypertext markup language");
        map.put("spring","java framework");
        map.put("react","frontend library");

        // map 크기
        System.out.println(map.size()); // 5

        // entry 검색 Method (주로 key 로 검색)
        boolean b1 = map.containsKey("java");// return boolean | true
        boolean b2 = map.containsKey("css");// return boolean | true
        boolean b3 = map.containsKey("jsp");// return boolean | false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry 의 value 얻기
        String value1 = map.get("java");
        String value2 = map.get("react");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        String value3 = map.get("jsp");
        System.out.println("value3 = " + value3); // null

        // entry 수정 Method
        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4);

        if (map.containsKey("css")) {
            map.put("css", "스타일 시트");
        }

        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }

        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        // entry 삭제 Method
        System.out.println(map.size());
        String value6 = map.remove("css");
        System.out.println(map.size());
        System.out.println("value6 = " + value6);
        String value7 = map.remove("css");
        System.out.println(map.size());
        System.out.println("value7 = " + value7);

        // 전체 탐색
        // 1. keySet
        Set<String> keys = map.keySet();

        // forEach
        // iterator
        // enhanced for

        // 2. entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // forEach
        // iterator
        // enhanced for
    }


}
