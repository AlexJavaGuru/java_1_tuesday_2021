package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class BoxProcessorImpl implements BoxProcessor {

    public int getNextFreeSpaceIndex() {
        System.out.println("Getting index...");
        return 0;
    }

    public boolean putSomethingIntoTheBoxByIndex(int index) {
        System.out.println("Put something...");
        return true; //or false
    }

    public void sortTheBox() {
        System.out.println("Sorting...");
        //sorting
    }

    public void removeItemFromTheBox() {
        System.out.println("Removing item...");
    }
}
