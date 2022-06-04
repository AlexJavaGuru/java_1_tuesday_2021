package student_daniel.lesson8.level2;

public class Porsche911Demo {
    //Task 6
    public static void main(String[] args) {
        Porsche911 myPorsche911 = new Porsche911(1980, 220);

        int year = myPorsche911.getReleaseYear();
        int speed = myPorsche911.getTopSpeed();

        System.out.println("Car year = " + year + " and car top speed = " + speed);
    }
}
