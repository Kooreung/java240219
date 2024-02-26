package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        } // for 문 작성 시 index 변수는 정수형으로
        // 부동소수점 float 은 금지
    }
}
