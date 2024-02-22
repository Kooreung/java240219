public class Main3 {
    public static void main(String[] args) {
        int pencils = 534;
        int studuents = 30;

        int pencilsPerStudent = pencils/studuents;
        System.out.println("pencilsPerStudent = " + pencilsPerStudent);

        int pencilsLeft = pencils%studuents;
        System.out.println("pencilsLeft = " + pencilsLeft);
    }
}
