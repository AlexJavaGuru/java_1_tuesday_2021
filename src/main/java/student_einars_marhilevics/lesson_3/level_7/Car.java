package student_einars_marhilevics.lesson_3.level_7;

class Car {
    String model;
    String engineType;
    int yearOfIssue;
    Car(String carModel, String engineType, int year) {
        this.model = carModel;
        this.engineType = engineType;
        this.yearOfIssue = year;
    }
    void turnOn () {
        System.out.println(this.model + " Wroom Wroom");
    }
    void drive () {
        System.out.println(this.model + " driving");
    }
}
