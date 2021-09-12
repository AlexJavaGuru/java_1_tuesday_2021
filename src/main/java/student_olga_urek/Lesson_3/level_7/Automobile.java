package student_olga_urek.Lesson_3.level_7;

//Task 29

class Automobile {
    String color;
    double petrol;
    double mileage;

    public Automobile(String color, double petrol, double mileage) {
        this.color = color;
        this.petrol = petrol;
        this.mileage = mileage;
    }
    double fillTank(double litersPetrol) {
        this.petrol = petrol + litersPetrol;
        return litersPetrol;
    }
/* Я понимаю, что тут бы пригодилось ограничение значений, которые может принимать переменная petrol, т.е. не меньше нуля
и не больше объема бака. Но не знаю, как это реализовать, т.е. как сделать так, чтобы ошибка вылетала, если значение переменной выходит
за пределы.

 */
    double driveCar(double driveDistance) {
        this.mileage = mileage + driveDistance;
        this.petrol = petrol - driveDistance * 0.1;
        return driveDistance;
    }

    public void paintCar (String newColor) {
        this.color = newColor;
    }

    public void tankStatus () {System.out.println("Your car has " + petrol + " liters of petrol in the tank!");}
    public void mileageStatus () {System.out.println("Your car has run for " + mileage + " kilometers!");}
    public void whatColor () {System.out.println("Your car is " + color);}

}

