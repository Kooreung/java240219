package ch12.lecture.p1object;

public class C02ToString {
    public static void main(String[] args) {
        Object o1 = new C02MyClass("king", "soul", 32);
        System.out.println("o1 = " + o1);

        Object o2 = new C02MyClass("lem", "pa", 22);
        System.out.println("o2 = " + o2.toString());
        System.out.println("o2 = " + o2);
    }
}

class C02MyClass {
    private String name;
    private String address;
    private int age;

    public C02MyClass(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // toString 재정의 할 때 보통 Field 정보를 Return
    @Override
    public String toString() {
        return "C02MyClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}