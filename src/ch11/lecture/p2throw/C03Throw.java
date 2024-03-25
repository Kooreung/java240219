package ch11.lecture.p2throw;

public class C03Throw {
    public static void main(String[] args) {
        try {
            someMethod1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // throws : Method 선언부에 발생하는 Exception 작성
    public static void someMethod1() throws Exception {
        throw new Exception();
    }
}
