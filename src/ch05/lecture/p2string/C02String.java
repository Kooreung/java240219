package ch05.lecture.p2string;

public class C02String {
    public static void main(String[] args) {
        String a = "son";
        String b = "lee";
        String c = "son";
        String d = new String("son");
        // new 를 생략하고 string literal 값 사용시 참조값이 같다.

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        //String 내용물 비교는 equals 사용

        System.out.println(a == c); // true
        System.out.println(a == d); // false
        System.out.println(a.equals(c)); // true
        System.out.println(a.equals(d)); // true
    }
}
