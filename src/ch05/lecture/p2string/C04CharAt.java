package ch05.lecture.p2string;

public class C04CharAt {
    public static void main(String[] args) {
        String a = "son";
        /*
        s = 문자열 첫번째 (index 0)
        o = 문자열 두번째 (index 1)
        n = 문자열 세번째 (index 2)
         */

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

        // char 타입은 값 그대로 return
        char c = a.charAt(0);

        String b = """
                hello
                world
                """; // 길이 = 12
        System.out.println(b.charAt(6));
        System.out.println(b.charAt(b.length() - 1));

    }
}
