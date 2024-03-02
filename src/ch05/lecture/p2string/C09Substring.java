package ch05.lecture.p2string;

public class C09Substring {
    public static void main(String[] args) {
        String str = "spring boot";

        str.substring(2,5);
        // 2번 index = r, 5번 index = g
        // 2번 index 부터 5번 index 이전까지 select (마지막은 포함되지 않는다.)
        System.out.println(str.substring(2,5));
        // result : rin

        System.out.println(str.substring(7,11));

        //substing begin index 만 받는 것도 있다.

        System.out.println(str.substring(7));

    }
}
