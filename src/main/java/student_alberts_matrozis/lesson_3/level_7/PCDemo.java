package student_alberts_matrozis.lesson_3.level_7;

class PCDemo {
    public static void main(String[] args) {
        PC pc = new PC("Windows 10", "Intel Core i5", "RTX 2060", 16);
        pc.turnOnPC();
        pc.checkMaxLaodInGame();
        pc.turnOffPC();
    }
}
