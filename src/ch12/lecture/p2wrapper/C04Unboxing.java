package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3;
        int c = a.intValue(); // 기존방식 Unboxing
        int b = a; // auto Unboxing

        Long d = 5L;
        double g = d; // auto unboxing + 기본 타입 간 형변환
        long e = d; // auto unboxing

        double f = e; // 기본 타입 간 형변환

        Integer h = null;
        // int i = h; // auto unboxing // NullPointerException

//        Long x = 10L;
//        int z = x;

        // double u = 10;
            // Double = double
            // Long = Double ( x )
        // Long r = u;

        // Long d = 5L;
            // long = Long
            // double = long ( o )
        // double g = d;

        // auto unboxing + 기본 타입 간 형변환
    }
}
