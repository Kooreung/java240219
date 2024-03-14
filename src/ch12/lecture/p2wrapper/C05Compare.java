package ch12.lecture.p2wrapper;

public class C05Compare {
    public static void main(String[] args) {
        int a = 60000;
        int b = 60000;

        System.out.println(a == b);

        Integer c = 70000; // auto boxing
        Integer d = 70000; // auto boxing

        System.out.println(c == d);
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        // 참조 타입이라 다르다

        System.out.println(c.equals(d));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
