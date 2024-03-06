package ch06.lecture.p7access;

public class C01AccessModifier {
    C01MyClass obj1 = new C01MyClass();
}

class C01MyClass {
    /* access modifier (접근 제한자, 접근 제어자)
    field, method, constructor, class 에서 작성 가능

    public, protected, (package private, default), private

    public : (가장 넓은 범위) 모든 곳에서 접근 가능
        하나의 파일에 하나의 public 만 사용 가능
    protected : PackagePrivate + 다른 패키지라도 상속 받으면 접근 가능
    PackagePrivate : 같은 패키지 내에서 접근 가능
    private : (가장 좁은 범위) 클래스 내에서만 접근 가능
    */

    // public field
    public int age;

    String name;

    // package private
    private String address;

    void method1() {
        System.out.println(age);
        System.out.println(name);
    }
}