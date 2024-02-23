package ch02.lecture.p02type;

public class C24parison {
    public static void main(String[] args) {

        // 큰 타입, 작은 타입 간 연산 결과는 큰 타입
        int g = 10;
        long h = 10;
        long i = h + g; // 연산 결과 long

        int j = 10;
        double k = 3.14;
        double l = j + k;

        // String 과 다른 타입 간 연산 결과는 String
        int m = 10;
        String n = "10";
        String o = m + n;

        System.out.println("o = " + o);
    }
}
