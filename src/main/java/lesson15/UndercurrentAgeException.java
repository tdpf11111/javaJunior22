package lesson15;

public class UndercurrentAgeException extends Exception {
    public UndercurrentAgeException() {
    }

    public UndercurrentAgeException(String message) {
        super(message);
    }

    public UndercurrentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndercurrentAgeException(Throwable cause) {
        super(cause);
    }

    public UndercurrentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
