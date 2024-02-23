package ch02.sec02;

import java.math.BigDecimal;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.123456789123456789f;
        double var2 = 0.123456789123456789;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);

        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
        // double(float) 은 근사값으로 저장됨
        // 연산 시 원하지 않은 결과가 나올 수 있음
        // BigDecimal 사용하여 문제 해결 가능

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println("f = " + f);
    }
}
