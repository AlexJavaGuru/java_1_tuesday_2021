package student_daniel.lesson9.level3;

public class FunctionalInterfaceImpl implements FunctionalInterface {
    //Task 6
    @Override
    public void doSomething() {
        System.out.println("smth");
    }

    //Uncomment @Override to check that FunctionalInterface allows only one abstract method
    //@Override
    public void doSomethingMore() {
        System.out.println("smth more");
    }
}
