package teacher.lesson_12_exceptions.lessoncode.var2;

public class IllegalAccessException extends RuntimeException {

    public IllegalAccessException(String message) {
        super(message);
    }

    public IllegalAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
