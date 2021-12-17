package student_sergej_pereligin.lesson_10.level_2;

public class ChildClass extends ParentClass { //Task_12

    private String firstName;

    protected ChildClass(String lastName, String firstName) {
        super(lastName);
        this.firstName = firstName;
    }
}
