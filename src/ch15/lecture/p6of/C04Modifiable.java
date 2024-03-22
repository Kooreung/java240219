package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C04Modifiable {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 1, 0, 9);
        // 수정 가능하도록 변형
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(10);
    }
}
