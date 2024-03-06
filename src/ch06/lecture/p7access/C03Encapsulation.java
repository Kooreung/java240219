package ch06.lecture.p7access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();

        obj1.setName("son");
        obj1.setAge(35);
    }
}

class C03MyClass {
    // 필드
    private String name;
    private int age;

    // 메소드
        // 보통 getter 와 setter 를 만들어서 작업한다.
        //getter method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

        //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int i) {
        this.age = age;
    }
}
