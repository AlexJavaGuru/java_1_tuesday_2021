package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class WarehouseService {

    private BoxProcessor boxProcessor;

    public WarehouseService(BoxProcessor boxProcessor) {
        this.boxProcessor = boxProcessor;
    }

    public void putItem(Item item) {
        int nextFreeIndex = boxProcessor.getNextFreeSpaceIndex();
        boxProcessor.putSomethingIntoTheBoxByIndex(nextFreeIndex);
    }

    public void doSorting() {
        boxProcessor.sortTheBox();
    }

    public void removeSomething() {
        boxProcessor.removeItemFromTheBox();
    }
}
