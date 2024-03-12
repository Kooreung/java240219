package ch09.sec07.exam01;

public class Car {
    // 타이어 굴리는 세 가지 방식

    // 1번 방법
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // 2번 방법
    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        }; // 익명 자식 객체 생성 방법2
        tire.roll();
    }

    // 3번 방법
    public void run3(Tire tire) {
        tire.roll();
    }
}
