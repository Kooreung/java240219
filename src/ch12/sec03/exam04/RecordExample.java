package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter", "눈송이", 31);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "눈송이", 31);
        Member m2 = new Member("winter", "눈송이", 31);
        System.out.println("m.hashcode() : " + m.hashCode());
        System.out.println("m1.hashcode() : " + m1.hashCode());
        System.out.println("m2.hashcode() : " + m2.hashCode());
        System.out.println(m1.equals(m2));
    }
}
