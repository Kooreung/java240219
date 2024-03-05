package ch06.lecture.p3constructor;

public class C08This {
}

class C08MyClass {
    int age;
    String name;
    String address;

    public C08MyClass(String address, String name, int age) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public C08MyClass(String name) {
        // this() : 생성자 호출
//        this.age = 1;
//        this.name = name;
//        this.address = "없음";
        this("없음",name,1);
    }


}