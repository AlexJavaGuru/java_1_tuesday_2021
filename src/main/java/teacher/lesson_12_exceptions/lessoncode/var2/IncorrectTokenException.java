package teacher.lesson_12_exceptions.lessoncode.var2;

public class IncorrectTokenException extends RuntimeException {

    private String currentToken;

    public IncorrectTokenException(String message, String currentToken) {
        super(message);
        this.currentToken = currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }
}
