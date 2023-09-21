package student_alberts_matrozis.lesson_10.level_1.task_5;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1337, 5000); // Money = 5000
        safe.getMoney(1337, 5000); // Money = 0
        safe.putMoney(1338, 10000000); // Money = 0
        safe.putMoney(1337, 10000); // Money = 10000
    }
}
