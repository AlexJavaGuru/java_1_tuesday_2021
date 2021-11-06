package student_julija_kuzmicova.lesson_10.level_2;

//Task_11
class ChildClass extends ParentClass {

    String text;

    public ChildClass(String name, String text) {
        super(name);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
