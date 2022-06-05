package student_daniel.lesson11.level1;

public class SomeObj {
    //Task 2
    private String firstName;
    private String lastName;

    public SomeObj(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "SomeObj{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
