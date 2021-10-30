package teacher.lesson_12_exceptions.lessoncode.var2;

import java.util.Optional;

public class Bank {

    public static final String VALID_TOKEN = "1234";

    public Optional<String> findUserById(Long id, String token) {
        if (token == null) {
            throw new IllegalAccessException("API was called without any token sent");
        }
        if (!token.equals(VALID_TOKEN)) {
            throw new IncorrectTokenException("Incorrect token was used", token);
        }
        if (id == 1) {
            return Optional.of("Alex");
        } else if (id == 2) {
            return Optional.of("Oleg");
        } else {
            return Optional.empty();
        }
    }
}
