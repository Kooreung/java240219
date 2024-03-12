package ch09.lecture.p1nested;

public class C05EffectivelyFinal {
    void method(int param) {
        int i = 3; // final 형태
        class LocalClass {
            void method() {
                System.out.println();
                System.out.println(param);
            }
        }
    }
}
