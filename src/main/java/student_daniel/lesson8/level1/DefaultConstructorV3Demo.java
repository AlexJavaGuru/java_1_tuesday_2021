package student_daniel.lesson8.level1;

public class DefaultConstructorV3Demo {
    //Task 3
    public static void main(String[] args) {
        DefaultConstructorV3 myDefaultConstructorV3 = new DefaultConstructorV3("Daniel Gu", 37, true, false);

        String fullName = myDefaultConstructorV3.getFullName();
        int age = myDefaultConstructorV3.getAge();
        boolean male = myDefaultConstructorV3.isMale();
        Boolean female = myDefaultConstructorV3.getFemale();

        System.out.println("Full name = " + fullName + " Age = " + age + " Male = " + male + " Female = " + female);
    }
}