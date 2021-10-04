package student_einars_marhilevics.lesson_8.level_1;

public class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private boolean female;

    public DefaultConstructorV3(String fullName, int age, boolean male, boolean female) {
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

    public boolean isFemale() {
        return female;
    }
}
