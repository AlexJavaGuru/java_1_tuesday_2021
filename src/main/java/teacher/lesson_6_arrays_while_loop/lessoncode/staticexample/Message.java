package teacher.lesson_6_arrays_while_loop.lessoncode.staticexample;

public class Message {

    static int instancesCounter = 0;

    String text;

    public Message(String text) {
        instancesCounter++;
        this.text = text;
    }

    public static int getInstancesCounter() {
        return instancesCounter;
    }

    public static void increaseValue() {
        instancesCounter++;
    }

    public String getText() {
        return text;
    }
}
