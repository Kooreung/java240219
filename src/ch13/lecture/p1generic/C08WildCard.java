package ch13.lecture.p1generic;

public class C08WildCard {
    public void main() {
    }

    public static void method1(C07Box <? extends Object> box) {}

    public static void method2(C07Box<?> box) {}
}


