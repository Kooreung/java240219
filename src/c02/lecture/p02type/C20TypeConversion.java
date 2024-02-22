package c02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {

        byte a = 23;
        int b = a;
        short c = a;
        long d = a;

        short e = 22323;
        int f = e;
        long g = e;

        int i = 300;
        long j = i;

        j = 400;
        i = (short) j;
        System.out.println(j);

        // 정수형을 실수형에 할당 가능

        long p = 1234;
        float q = p;
        double r = p;

        // char 는 int 이상에 할당 가능
        char s = '헤';
        int t = s;

        short v = 33;
        int w = v;


    }
}
