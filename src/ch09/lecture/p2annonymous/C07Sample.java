package ch09.lecture.p2annonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명 클래스 객체 만들기
        Game rpsGame = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int answer = random.nextInt(3);
                String[] rps = {"가위", "바위", "보"};
                System.out.println(rps[answer]);
            }
        };
        rpsGame.play(); // 가위, 바위, 보 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int number = 0;
                int[] answer = new int[6];
                while (number < 6) {
                    int randomNumber = random.nextInt(45) + 1;

                    boolean sw = false;

                    for (int i = 0; i < 6; i++) {
                        if (answer[i] == randomNumber) {
                            sw = true;
                            break;
                        }
                    }

                    if (!sw) {
                        answer[number] = randomNumber;
                        number++;
                    }
                }
                Arrays.sort(answer);
                System.out.println(Arrays.toString(answer));
            }
        };
        lottoGame.play();
        lottoGame.play();
        lottoGame.play();
        lottoGame.play();
        lottoGame.play();
        // 초보자 : 1~45 값 중 1개 출력
        // 중급자 : 1~45 값 중 6개 중복 없이 출력
    }
}

interface Game {
    void play();
}