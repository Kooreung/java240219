package ch16.exercise.p8;


public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수 : " + englishAvg);
    }

    private static double avg(Funtion<Student> function) {
        double sum = 0.0;

        for(Student student : students) {
            sum += function.apply(student);
        }

        return sum / students.length;
    }
}
