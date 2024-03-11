package ch08.lecture.p1interface;

public class C04Field {
    public static void main(String[] args) {
        int a = C04MyInterface.AGE;
        System.out.println(a);
        System.out.println(C04MyInterface.NAME);
        System.out.println(C04MyInterface.MY_ADRESS + "입니다.");
    }
}

interface C04MyInterface {
    //field
    // 인터페이스의 필드는 모두 public static final
    // static 이름 짓기 : UPPERCASE_SNAKE_CASE
    // final 특징 : 값을 무조건 할당 해줘야 함
    int AGE = 0;
    String NAME = "son hm";
    String MY_ADRESS = "london";

    //public abstract
    void method1();
}