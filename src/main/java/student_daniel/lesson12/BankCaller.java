package student_daniel.lesson12;

import java.util.Optional;

public class BankCaller {
    Bank myBank;
    public BankCaller(Bank myBank) {
        this.myBank = myBank;
    }
    public void callUserById() {
        Optional<String> userOpt = Optional.empty();
        try {
            //will handle exemption
            userOpt = myBank.findById(1L, "4321");
            //will pass without exemption
            //userOpt = myBank.findById(1L, "1234");
        } catch (RuntimeException e) {
            System.out.println("Caught! " + e.getMessage());
        }
        if(userOpt.isPresent()) {
            String user = userOpt.get();
            System.out.println(user);
        }
        System.out.println("We reached here!");
    }
}
