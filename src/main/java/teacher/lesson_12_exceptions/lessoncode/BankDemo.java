package teacher.lesson_12_exceptions.lessoncode;

public class BankDemo {

    public static void main(String[] args) {
        BankCaller bankCaller = new BankCaller(new Bank());

        bankCaller.callUserById();
    }
}
