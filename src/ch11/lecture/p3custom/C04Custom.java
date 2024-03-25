package ch11.lecture.p3custom;

public class C04Custom {
    public static void main(String[] args) throws LackOfCaffeine {
        method1();
    }

    public static void method1() throws LackOfCaffeine {
        throw new LackOfCaffeine("카페인 부족");
    }
}

class LackOfCaffeine extends Exception {
    LackOfCaffeine() {
    }

    LackOfCaffeine(String message) {
        super(message);
    }
}