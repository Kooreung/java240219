package ch12.lecture.p1object;

import java.util.Objects;

public class C07HashCode {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass("자바");
        C07MyClass o2 = new C07MyClass("자바");
        C07MyClass o3 = new C07MyClass("스프링");

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(o3));
        System.out.println(o3.hashCode());
    }
}

class C07MyClass {
    String title;

    public C07MyClass(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        C07MyClass that = (C07MyClass) o;

        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    // hashCode
    /*
    1. 같은 객체가 hashCode 를 여러 번 호출해도
        같은 값이 나와야 한다.
    2. equals 로 같은 객체로 여겨지면 두 객체의
        hashCode 는 같아야 한다.
    3. 두 객체가 equals 로 같지 않더라도
        두 객체의 hashCode 는 같을 수도 있다.
        (하지만 다르면 더 좋다.)

     */
}