package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01Of {
    public static void main(String[] args) {
        // Collection 에서 쓸 수 있는 Static Method 'of'
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);

        // of : Element 추가, 삭제 불가능
        List<String> list2 = List.of("java","css","html","react");
        System.out.println(list2);
    }
}
