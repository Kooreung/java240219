package ch16.exercise.p7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x, y) -> Math.max(x,y));
        // int max = maxOrMin((x, y) -> x > y ? x : y); // 3항연산
        // int max = maxOrMin(Math::max);
        System.out.println("최대값 : " + max);

        int min = maxOrMin((x, y) -> Math.min(x,y));
        System.out.println("최소값 : " + min);
    }
}
