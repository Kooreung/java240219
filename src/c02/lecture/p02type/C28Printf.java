package c02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        int num = 12;
        System.out.printf("hello world"); // 파라미터 1개, print와 유사
        System.out.println("");
        System.out.printf("hello %s","kim"); // 파라미터 2개, 첫번째 파라미터 문자열에 두번째 파라미터를 포함해서 출력
        System.out.printf("hello %s and %s and %s", "kim", "park", num);
        //Format string
        System.out.println("");
        System.out.println(STR."hellow \{num} good");
        //자바 21부터

        // printf 마우스 오버 시 나오는 설명
        // "%2$s %1$s", "a" , "b"; -> 2번째스트링 1번째스트링

        System.out.printf("%5$s", "kim", "park", num);
    }
}
