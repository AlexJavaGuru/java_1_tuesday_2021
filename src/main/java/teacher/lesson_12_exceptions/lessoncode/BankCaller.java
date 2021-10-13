package teacher.lesson_12_exceptions.lessoncode;

import java.util.Optional;

public class BankCaller {

    Bank bankSystem;

    public BankCaller(Bank bankSystem) {
        this.bankSystem = bankSystem;
    }

    public void callUserById() {
        //получили от юзера ID
        String token = "4321";
        Optional<String> userOpt = Optional.empty();

        try {
            userOpt = bankSystem.findUserById(1L, token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (userOpt.isPresent()) {
            String user = userOpt.get();
            System.out.println(user);
        }
    }

}
