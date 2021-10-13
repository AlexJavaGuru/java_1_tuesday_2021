package teacher.lesson_12_exceptions.lessoncode.var2;

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
            userOpt = bankSystem.findUserById(1L, "6435");
        }  catch (IllegalAccessException | IncorrectTokenException e) {
            System.out.println("1st catch");
            System.out.println(e.getMessage());
            throw new IllegalStateException("Something went wrong..", e);
        } finally {
            System.out.println("Finally block");
        }

        if (userOpt.isPresent()) {
            String user = userOpt.get();
            System.out.println(user);
        }

        System.out.println("Something");
    }

}
