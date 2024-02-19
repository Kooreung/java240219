package c02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        /*
            변수 : variable
            값을 저장하는 공간의 이름
            변수 선언 : 저장 공간을 만들기로 지정한다.
            변수 선언 방법 : 타입명 변수명
         */
        int a;  // int 타입의 변수(저장공간). a라는 변수이름

        // 변수에 값을 저장 (assignment, 할당. 대입.)
        // 저장 방법 : 변수 명 = 값
        a = 10;

        System.out.println(a);

        a = 9;

        System.out.println(a);

        // 변수 b를 int 타입으로 선언. 100을 할당

        int b = 100;

        System.out.println(b);

        // 변수 작성 관습
        // 소문자로 시작
        // 여러 단어의 조합이면, 각 단어의 앞글자만 대문자
        // lowerCamelCase

        // 변수 작성 규칙
        // 변수명에 사용할 수 있는 문자 : 영문대소문자, 숫자, $, _
        // 숫자로 시작 불가능

        // 같은 변수 명을 다시 선언할 수 없음
        // 자바의 키워드(예약어) 는 변수로 사용 불가능


        //변수를 명령문에서 바로 선언 가능
        int c = 10 ;

        // 변수 여러개를 한 명령문에서 선언 가능
        int d, e, f;

        // 여러 변수 선언, 값 할당을 한 명령문에 작성 가능
        int g = 11, h = 12, i = 13;

        // 다른 변수의 값을 대입하는 것이 가능
        int j = i;

    }
}
