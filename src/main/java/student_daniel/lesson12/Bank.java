package student_daniel.lesson12;

import java.util.Optional;

public class Bank {

    public Optional<String> findById(Long id, String token) {
        if(!token.equals("1234")) {
            //return "Wrong Token";
            throw new RuntimeException("Wrong Token!");
        }
        if(id == 1) {
            return Optional.of("Dan");
        } else if (id == 2) {
            return Optional.of("Other");
        } else {
            return Optional.empty();
        }
    }
}
