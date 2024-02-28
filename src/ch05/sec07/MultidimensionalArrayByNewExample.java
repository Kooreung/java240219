package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3]; // 2행 3열

        for (int i = 0; i < mathScores.length; i++) { //i 는 행의 길이만큼 반복 == 2
            for (int k = 0; k < mathScores[i].length; k++) { // k는 열의 길이만큼 반복 == 3
                System.out.println("mathScores[" + i + "][" + k + "] : " + mathScores[i][k]);
            }
        }

        mathScores[0] = new int[] {80, 83, 85}; // 1행 원소 값 지정
        mathScores[1] = new int[] {86, 90, 92}; // 2행 원소 값 지정

        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) { //i 는 행의 길이만큼 반복
            for (int k = 0; k < mathScores[i].length; k++) { //k 는 열의 길이만큼 반복
                totalMathSum += mathScores[i][k]; // 원소들의 합산
            }
            totalStudent += mathScores[i].length; // 열의 갯수 합산 == 6
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
        System.out.println("");

        int[][] englishScores = new int [2][];
        englishScores[0] = new int [2];
        englishScores[1] = new int [3];

        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "] : " + englishScores[i][k]);
            }
        }
        System.out.println("");

        englishScores[0] = new int[] {90, 91};
        englishScores[1] = new int[] {92, 93, 94};

        totalStudent = 0;
        int totalEnglishSum = 0;

        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 : " + totalEnglishAvg);

    }
}
