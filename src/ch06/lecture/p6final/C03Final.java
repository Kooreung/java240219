package ch06.lecture.p6final;

public class C03Final {
    public static void main(String[] args) {
        C03MyClass obj = new C03MyClass();
        System.out.println(obj.i);
        obj.i = 3;
        System.out.println(obj.i);
        obj.i = 10;
        System.out.println(obj.i);
//        obj.j = 10; // final 변수 값이므로 불가능
//        obj.k = 200; // final 변수 값이므로 불가능
        System.out.println(obj.j);
        System.out.println(obj.k);
    }
}

class C03MyClass {
    int i;
    final int j = 10;
    final int k; // 무조건 할당을 1번 해야하므로 할당이 필요함

    C03MyClass() {
//        생성자에서 instance field 초기화
        k = 200;
    }
}

// field 예시