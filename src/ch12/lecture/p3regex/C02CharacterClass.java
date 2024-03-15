package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자 집합
        System.out.println("a".matches("[abcd]")); // true
        System.out.println("b".matches("[abcd]")); // true
        System.out.println("ab".matches("[abcd]")); // false

        System.out.println("abc".matches("[abc]")); // false
        System.out.println("bac".matches("[abc]")); // false
        System.out.println("cab".matches("[abc]")); // false
        System.out.println();

        String p1 = "[abc][abc][abc]"; // true
        System.out.println("abc".matches(p1));
        System.out.println("bac".matches(p1));
        System.out.println("cab".matches(p1));
        System.out.println("ccc".matches(p1));
        System.out.println("bbb".matches(p1));
        System.out.println("aaa".matches(p1));
        System.out.println();

        String p2 = "[a-z]";
        System.out.println("a".matches(p2)); // true
        System.out.println("z".matches(p2)); // true
        System.out.println("A".matches(p2)); // false
        System.out.println("Z".matches(p2)); // false
        System.out.println("0".matches(p2)); // false
        System.out.println();

        String p3 = "[a-zA-Z]"; // abcd...wxyzABCD...WXYZ
        System.out.println("s".matches(p3));
        System.out.println("S".matches(p3));
        System.out.println();

        String p4 = "[a-zA-Z0-9]";
        String p5 = "[가-힣]"; // 한글 한글자

        String p6 = "[^abc]"; // 제외하는 방법
        System.out.println("a".matches(p6)); // false
        System.out.println("d".matches(p6)); // true
        System.out.println("A".matches(p6)); // true
        System.out.println("8".matches(p6)); // true
    }
}
