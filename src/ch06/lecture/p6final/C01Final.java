package ch06.lecture.p6final;

public class C01Final {
    public static void main(String[] args) {
        // final 키워드가 변수와 사용되면
        // 변수에 값을 딱 1번 할당 할 기회를 갖는다.

        // 변수
            // 지역변수 : 메소드 내에서 선언 된 변수
            // 파라미터 : 메소드 실행 시 값을 받는 변수
            // 필드 : 인스턴스 필드와 스태틱 필드


        // 지역변수 예시
        int i;
        i = 0;
        i = 3;

        final int j; // js 에서 const 같은 역할
        j = 3; // 할당을 아예 안하는 것도 불가능
        // j = 5; // 두 번째 할당은 불가능

        final int k = 30;
    }
}
