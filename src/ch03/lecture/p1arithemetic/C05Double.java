package ch03.lecture.p1arithemetic;

public class C05Double {
    public static void main(String[] args) {
        //double 은 근사치 저장
        double a = 0.1;
        double b = 0.2;
        double c = a+ b;
        System.out.println("c = " + c);
        // 해결책1 : 정확한 산술 연산을 위해서는 정수 연산으로.
        a *= 10;
        b *= 10;
        int d = (int)a + (int)b;
        c = d / 10.0;
        System.out.println("d = " + d);
        System.out.println("c = " + c);
    }
}
