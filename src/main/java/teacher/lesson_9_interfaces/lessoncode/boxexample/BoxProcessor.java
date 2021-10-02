package teacher.lesson_9_interfaces.lessoncode.boxexample;

public interface BoxProcessor {

    int CONST = 10;

    int getNextFreeSpaceIndex();

    boolean putSomethingIntoTheBoxByIndex(int index);

    void sortTheBox();

    void removeItemFromTheBox();

}
