package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식 : 특정 규칙의 문자열 표현하기 위한 문자열 패턴

        // 한 문자 검증하기
        String pattern1 = "a";
        boolean b1 = "a".matches(pattern1);
        System.out.println("b1 = " + b1); // true
        System.out.println("b".matches(pattern1)); // false
        System.out.println("aa".matches(pattern1)); // false
        System.out.println("aa".matches("aa")); // ?이상해
        System.out.println("ab".matches("ab"));
        System.out.println("ab".matches("ba"));

        System.out.println("\\".matches("\\\\"));
        // regex 에서 . 은 모든 문자열이라는 뜻
        System.out.println(".".matches(".")); // true
        System.out.println("C".matches(".")); // true
        System.out.println("g".matches(".")); // true
        System.out.println("abc".matches(".")); // false
        System.out.println(".".matches("\\.")); // true

        // 대소문자 구분 함
        System.out.println("a".matches("a")); //true
        System.out.println("a".matches("A")); //false
        System.out.println("A".matches("a")); //false
    }
}
