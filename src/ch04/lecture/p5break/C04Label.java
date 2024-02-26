package ch04.lecture.p5break;

public class C04Label {
    public static void main(String[] args) {
        // 반복문에 label 을 붙여서 break 로 종료 시킬 수 있다.

        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(STR."(\{i}, \{j})");

                if (j==5){
                    break;
                }
            }
        }
    }
}
