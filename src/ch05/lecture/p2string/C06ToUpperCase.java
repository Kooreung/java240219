package ch05.lecture.p2string;

public class C06ToUpperCase {
    public static void main(String[] args) {
        String s1 = "my name is 손";
        String s2 = s1.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s2.toLowerCase();
        System.out.println(s3);
    }
}
