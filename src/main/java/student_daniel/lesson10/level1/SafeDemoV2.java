package student_daniel.lesson10.level1;

class SafeDemoV2 {
    //Task 5
    public static void main(String[] args) {
        SafeV2 mySafe = new SafeV2(1234, 99.99);

        System.out.println("Starting amount: " + mySafe.getAmount());

        mySafe.putMoney(1234, 500);
        System.out.println("Increase amount: " + mySafe.getAmount());

        mySafe.getMoney(1234, 100);
        System.out.println("Decrease amount: " + mySafe.getAmount());
    }
}
