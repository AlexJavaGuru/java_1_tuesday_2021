package teacher.lesson_7_encapsulation.lessoncode;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String mark;
    private int HP;
    private int door;
    private boolean test;
    private double test2;
    private int[] arrayTest;
    private int currentSpeed;
    private Engine engine;

    public Car(String mark, Engine engine) {
        this.mark = mark;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return HP == car.HP &&
                door == car.door &&
                test == car.test &&
                Double.compare(car.test2, test2) == 0 &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(mark, car.mark) &&
                Arrays.equals(arrayTest, car.arrayTest) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", HP=" + HP +
                ", door=" + door +
                ", test=" + test +
                ", test2=" + test2 +
                ", arrayTest=" + Arrays.toString(arrayTest) +
                ", currentSpeed=" + currentSpeed +
                ", engine=" + engine +
                '}';
    }
}
