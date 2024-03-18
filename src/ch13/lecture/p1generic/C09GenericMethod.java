package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        method1("hello"); // String 으로 유추
        method1(34); // Integer 로 유추

        String s = method2(); // String 으로 유추
        Integer i = method2(); // Integer 로 유추

    }

    // Generic Method
    // 자바는 method parameter 에 들어오는 값으로 어떤 Type인지 유추하므로
    // 별도로 Type 명시를 안해줘도 된다.
    public static <T> void method1(T param) {

    }

    public static <T> T method2() {
        return null;
    };
}

