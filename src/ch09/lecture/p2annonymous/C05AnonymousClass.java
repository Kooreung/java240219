package ch09.lecture.p2annonymous;

public class C05AnonymousClass {
    public static void main(String[] args) {
        C05Parent obj1 = new C05Parent() {
        };

        /*
        method(obj1);
        method(new C05Parent() {});
        두 가지 방식으로 사용 가능
         */
    }

    public static void method(C05Parent param) {

    }
}

//@formatter:off
abstract class C05Parent {}