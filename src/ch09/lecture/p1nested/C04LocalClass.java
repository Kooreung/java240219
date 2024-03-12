package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        int j = 3; // effectively final
        // 값을 다시 변경하면 LocalClass 에서 못 쓴다.
        final int k = 2;
        class LocalClass {
            void method2() {
                int i = 0;
                System.out.println(i);
                // 지역변수 사용에 문제 없음
                i = 1;
                // 변수 값의 변화도 가능
                System.out.println(j);
                // method2 를 안고 있는 method1 의 변수도 사용 가능
                // j = 5;
                // 사용은 가능하지만 변수 값의 변화는 불가능
                // 감싸고 있는 method 의 final 지역변수만 사용 가능
                System.out.println(k); // final 의 특성과 같다.
            }
        }
    }
}
