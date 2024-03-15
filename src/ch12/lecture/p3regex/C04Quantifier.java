package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n 개
        // {n,m} : n ~ m 번
        // {n,} : 최소 n 개 , n 개 이상
        // + : 한 개 이상 = {1,}
        // * : 없음 또는 0 개 이상 = {0,}
        // ? : 한 개 또는 없음 = {0,1}

        //{n}
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1)); // true
        System.out.println("892".matches(p1)); // true
        System.out.println("68k".matches(p1)); // false
        System.out.println("6".matches(p1)); // false
        System.out.println();

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-1234".matches(p2)); // true
        System.out.println("011-1234-1234".matches(p2)); // false
        System.out.println("010-123-1234".matches(p2)); // false
        System.out.println("010-1234-123".matches(p2)); // false
        System.out.println("01012341234".matches(p2)); // false
        System.out.println();

        // {n, m}
        String p3 = "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3)); // true
        System.out.println("대한민국".matches(p3)); // true
        System.out.println("김국".matches(p3)); // false
        System.out.println();

        // {n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4)); // true
        System.out.println("대한민국".matches(p4)); // true
        System.out.println("김국".matches(p4)); // true
        System.out.println("서울특별시".matches(p4)); // true
        System.out.println("한".matches(p4)); // false
        System.out.println("한seoul".matches(p4)); // false
        System.out.println();

        // + : 한 번 이상
        String p5 = "[가-힣a-zA-Z]+"; // 영문대소문자와 한글 한글자 이상
        System.out.println("한국".matches(p5));
        System.out.println("korea".matches(p5));
        System.out.println("seoul한국".matches(p5));
        System.out.println("seoul 한국".matches(p5)); // false
        System.out.println();

        // ? : {0,1}
        String p6 = "010-?\\d{4}-?\\d{4}";
        System.out.println("010-1234-1234".matches(p6));
        System.out.println("01012341234".matches(p6));
        System.out.println("0101234-1234".matches(p6));
        System.out.println("010-12341234".matches(p6));
        System.out.println("01112341234".matches(p6)); // false

        // + : 1 번 이상
        String p7 = "\\w+";
        System.out.println("9313jgs_".matches(p7));
        System.out.println("".matches(p7)); // false

        // * : 0 번 이상
        String p8 = "\\w*";
        System.out.println("9313jgs_".matches(p7));
        System.out.println("".matches(p7));
    }
}
