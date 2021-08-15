package student_olga_urek.Lesson_3.level_1;
//Task 3, 4, 5, 6
public class RobotDemo {
    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
        Robot myRobot = new Robot();
        System.out.println("Now the first robot spoke:");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robotTwo = new Robot();
        System.out.println("Now the second robot spoke:");
        robotTwo.sayHello();
        robotTwo.sayYourName();

        Robot robotThree = new Robot();
        System.out.println("Now the third robot spoke:");
        robotThree.sayHello();
        robotThree.sayYourName();
    }
}
