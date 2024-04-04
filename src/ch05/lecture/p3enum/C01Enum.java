package ch05.lecture.p3enum;

public class C01Enum {
    public static void main(String[] args) {
        MyEnum1 x = MyEnum1.VALUE1;
        MyEnum1 y = MyEnum1.MY_VALUE;
        MyEnum1 z = MyEnum1.YOUR_VALUE;
        MyEnum1 a = MyEnum1.VALUE1;

        System.out.println(x == a);
    }
}

// enum 은 UPPER_SNAKE_CASE 로 쓰는 것이 관습
enum MyEnum1 {
    VALUE1,
    MY_VALUE,
    YOUR_VALUE,

}