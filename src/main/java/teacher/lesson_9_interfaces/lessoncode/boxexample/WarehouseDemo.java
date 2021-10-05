package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class WarehouseDemo {

    public static void main(String[] args) {
        BoxProcessor processor = new BoxProcessorNewImpl();
        WarehouseService warehouseService = new WarehouseService(processor);

        warehouseService.putItem(new Item());
        warehouseService.doSorting();
        warehouseService.removeSomething();
    }
}
