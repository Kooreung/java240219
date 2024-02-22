package c03.lecture.p4logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        {
            int i = 10;
            boolean b1 = (i++) == 10;
            System.out.println("b1 = " + b1);
            System.out.println("i = " + i);

            i = 10;
            boolean b2 = (i++) == 10 || (i++) == 20;
            System.out.println("b2 = " + b2);
            System.out.println("i = " + i);
            // 1번 비교가 true 라서 2번 비교까지 안갔기 때문에 i = 11

            i = 10;
            boolean b3 = (i++) == 20 || (i++) == 30;
            System.out.println("b3 = " + b3);
            System.out.println("i = " + i);
            // 1번 비교가 false 라서 2번 비교까지 갔기 때문에 i = 12

            i = 10;
            boolean b4 = (i++) == 10 | (i++) == 30;
            System.out.println("b4 = " + b4);
            System.out.println("i = " + i);
            // 1번 비교에서 true 이지만 2번 비교도 진행하기 때문에 i = 12
        }
    }

}
