package ch11.lecture.p1exception;

import java.util.List;

public class C05TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        try {
            for (int i = 0; i <= list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("모든 원소 출력");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace(); // catch 에서 웬만하면 꼭 작성
        }
        System.out.println("나머지 코드들");
    }
}
