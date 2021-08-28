package student_olga_urek.Lesson_3.level_7;

//Task 29

class AutomobileDemo {
    public static void main(String[] args) {
        Automobile myCar = new Automobile("black", 5.5, 24);

        myCar.paintCar("red");
        myCar.fillTank(2.5);
        myCar.tankStatus();

        myCar.driveCar(15);
        myCar.mileageStatus();
        myCar.tankStatus();
        myCar.whatColor();
    }
}
