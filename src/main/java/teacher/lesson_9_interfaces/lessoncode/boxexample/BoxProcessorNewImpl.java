package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class BoxProcessorNewImpl implements BoxProcessor {

    @Override
    public int getNextFreeSpaceIndex() {
        System.out.println("Not implemented yet");
        return 0;
    }

    @Override
    public boolean putSomethingIntoTheBoxByIndex(int index) {
        System.out.println("Putting something into the box in new way");
        return false;
    }

    @Override
    public void sortTheBox() {
        System.out.println("Sorting the box in new way");
    }

    @Override
    public void removeItemFromTheBox() {
        System.out.println("Removing in new way");
    }
}
