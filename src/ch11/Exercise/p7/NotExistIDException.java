package ch11.Exercise.p7;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
    }
    public NotExistIDException(String message) {
        super(message);
    }
}
