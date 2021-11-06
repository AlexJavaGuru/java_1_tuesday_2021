package student_einars_marhilevics.lesson_10.level_1;

class SafeVolTwoDemo {
    public static void main(String[] args) {
        SafeVolTwo safeVolTwo = new SafeVolTwo(1234, 1000);
        safeVolTwo.putMoney(1234, 2000);
        System.out.println(safeVolTwo.getAmount());
        safeVolTwo.getMoney(1234, 2500);
        System.out.println(safeVolTwo.getAmount());
        safeVolTwo.putMoney(123, 2000);
        System.out.println(safeVolTwo.getAmount());
        safeVolTwo.getMoney(123, 2500);
        System.out.println(safeVolTwo.getAmount());
    }
}
