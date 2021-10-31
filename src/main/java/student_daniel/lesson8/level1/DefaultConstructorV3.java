package student_daniel.lesson8.level1;

public class DefaultConstructorV3 {
    //Task 3
    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public DefaultConstructorV3(String fullName, int age, boolean male, Boolean female) {
        this.fullName = fullName;
        this.age = age;
        this.male = male;
        this.female = female;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean getFemale() {
        return female;
    }
}