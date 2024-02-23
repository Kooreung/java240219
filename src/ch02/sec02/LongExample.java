package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        long var3 = 1000000000; // L이 없어서 오류 발생 or 발생할 수 있음
        long var4 = 1000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
