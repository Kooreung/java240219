package ch12.lecture.p2wrapper;

public class C05Compare {
    public static void main(String[] args) {
        int a = 60000;
        int b = 60000;

        System.out.println(a == b); // true

        Integer c = 70000; // auto boxing
        Integer d = 70000; // auto boxing

        System.out.println(c == d); // false
        System.out.println(c.hashCode()); // 70000
        System.out.println(d.hashCode()); // 70000
        // 참조 타입이라 다르다

        System.out.println(c.equals(d)); // true
        System.out.println(System.identityHashCode(c)); // 189568618
        System.out.println(System.identityHashCode(d)); // 793589513
    }
}
