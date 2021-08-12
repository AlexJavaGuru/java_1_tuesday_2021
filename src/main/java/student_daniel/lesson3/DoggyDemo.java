package student_daniel.lesson3;

public class DoggyDemo {
    public static void main(String[] args) {
        Doggy nameOne = new Doggy("Venik");
        Doggy nameTwo = new Doggy("Rem");

        nameOne.sleep();
        nameTwo.sleep();

        System.out.println(nameOne.age);
        System.out.println(nameTwo.age);

        nameOne.birthDay();
        nameOne.birthDay();
        nameOne.birthDay();
        System.out.println(nameOne.age);
        System.out.println(nameTwo.age);
    }
}
