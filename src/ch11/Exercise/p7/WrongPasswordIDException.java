package ch11.Exercise.p7;

public class WrongPasswordIDException extends Exception {
    public WrongPasswordIDException() {
    }
    public WrongPasswordIDException(String message) {
        super(message);
    }
}
