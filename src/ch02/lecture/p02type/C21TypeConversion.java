package ch02.lecture.p02type;

public class C21TypeConversion {
    public static void main(String[] args) {
        // 자동타입 변환 : 작은 타입 -> 큰 타입
        // 강제타입 변환 (casting) : 큰 타입 -> 작은 타입

        long a = 234;
        double b = (double) a; // 강제타입 변환

        System.out.println(b);
        System.out.println((double) a);

        short c = 130;
        byte d = (byte) c;

        System.out.println(d);
    }
}
