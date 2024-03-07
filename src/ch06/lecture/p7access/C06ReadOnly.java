package ch06.lecture.p7access;

public class C06ReadOnly {
    public static void main(String[] args) {
        C06MyClass1 obj1 = new C06MyClass1("김철수",32);
        C06MyClass1 obj3 = new C06MyClass1("김철수",32);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());

        C06MyClass2 obj2 = new C06MyClass2("박덕배", 45);
        System.out.println(obj2.name());
        System.out.println(obj2.age());

        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj2.hashCode());
    }
}
//record : 14버전 이후에 등장

record C06MyClass2 (
        String name,
        int age
){

}

class C06MyClass1 {
    private String name;
    private int age;

    public C06MyClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}