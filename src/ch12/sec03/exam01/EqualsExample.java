package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }

        if (obj1.equals(obj3)) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }
}
