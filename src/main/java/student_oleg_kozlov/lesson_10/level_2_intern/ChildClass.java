package student_oleg_kozlov.lesson_10.level_2_intern;

// Task_11
class ChildClass extends ParentClass {
    private String text;

    public String getText() {
        return text;
    }

    public ChildClass(int number, String text) {
        super(number);
        this.text = text;
    }
}
