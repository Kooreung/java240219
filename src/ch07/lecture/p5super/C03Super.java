package ch07.lecture.p5super;

public class C03Super {
    public static void main(String[] args) {

    }
}

class C03Parent {
    C03Parent() {
        // argument 있는 생성자를 만들면
        // argument 없는 생성자 자동 추가는 안됨
    }

    C03Parent(int age) {
    }

    C03Parent(String name, int age) {
    }
}
class C03Child extends C03Parent {
    C03Child() {
        super(3);
    }

//    C03Child2() {
//        super("asd",3);
//    }
    // 부모 클래스에서 파라미터 없는 생성자를 만들게 되면 생기는 것
//    C03Child() {
//        super();
//    }
}