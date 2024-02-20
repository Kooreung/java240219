package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {

        String name = "hon";
        String age = "32";

        String desc2 = String.format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{ name } and age is \{ age }";
        System.out.println(desc3);

        String address = "서울";
        String country = "한국";

        String desc4 = String.format("내가 사는 지역은 %s 에 있는 %s 입니다.", country, address);
        System.out.println(desc4);
    }
}
