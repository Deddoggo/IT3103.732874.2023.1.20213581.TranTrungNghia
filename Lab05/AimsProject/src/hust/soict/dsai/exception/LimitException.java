package hust.soict.dsai.exception;

public class LimitException extends Exception {
    public LimitException() {

    }

    public LimitException(String message) {
        super(message);

    }

    public LimitException(Throwable cause) {
        super(cause);
    }

    public LimitException(String message, Throwable cause) {
        super(message, cause);
    }

}