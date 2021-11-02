package student_oleg_kozlov.lesson_10.level_2_intern;

// Task_11
class Task11Demo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass(10, "My text");
        System.out.println("Number = " + childClass.getNumber() + "; Text = " + childClass.getText());
    }
}
