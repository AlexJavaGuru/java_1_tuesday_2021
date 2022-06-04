package student_daniel.lesson12;

public class BankDemo {
    public static void main(String[] args) {
        BankCaller bankCaller = new BankCaller(new Bank());

        bankCaller.callUserById();
    }
}
