package student_daniel.lesson10.level1;

class SafeDemo {
    //Task 4
    public static void main(String[] args) {
        Safe mySafe = new Safe();

        System.out.println("Pin default: " + mySafe.getPin());
        System.out.println("Amount default: " + mySafe.getAmount());
        mySafe.setPin(mySafe.pin = 1234);
        mySafe.setAmount(mySafe.amount + 500.00);
        System.out.println();
        System.out.println("Pin after Change: " + mySafe.getPin());
        System.out.println("Amount after Changes: " + mySafe.getAmount());
    }
}
