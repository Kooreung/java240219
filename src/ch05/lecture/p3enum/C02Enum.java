package ch05.lecture.p3enum;

public class C02Enum {
    public static void main(String[] args) {
        // enum -> 안전하고 읽기 쉬운 코드 작성을 위해 사용
        Season s = Season.FALL;

        switch (s) {
            case SPRING -> System.out.println("봄이네요");
            case SUMMER -> System.out.println("여름이네요");
            case FALL -> System.out.println("가을이네요");
            case WINTER -> System.out.println("겨울이네요");
        }

        System.out.println("-----");

        // java.lang.Enum 에서 상속한 Method
        System.out.println(s.name());
        System.out.println(s.ordinal());

        // java.lang.Object 에서 상속한 Method
        System.out.println(s.toString());
        System.out.println(s.hashCode());

        System.out.println("-----");

        s.printDesciption();
    }


}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    // Method 작성 가능
    public void printDesciption() {
        System.out.println(this.name() + "이네요");
    }
}