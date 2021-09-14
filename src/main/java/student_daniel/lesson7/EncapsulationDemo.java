package student_daniel.lesson7;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulation counter = new Encapsulation();

        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getCount());
        //counter.setCount();
        System.out.println(counter.getCount());
    }
}
