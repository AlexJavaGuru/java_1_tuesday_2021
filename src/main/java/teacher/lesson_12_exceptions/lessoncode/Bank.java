package teacher.lesson_12_exceptions.lessoncode;

import java.util.Optional;

public class Bank {

    public Optional<String> findUserById(Long id, String token) throws Exception {
        if (!token.equals("1234")) {
            throw new Exception("Wrong token");
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
