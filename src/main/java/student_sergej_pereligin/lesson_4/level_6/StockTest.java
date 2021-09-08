package student_sergej_pereligin.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        System.out.println(google.getPriceInformation());

        google.updatePrice(11);
        System.out.println(google.getPriceInformation());
        google.updatePrice(50);
        System.out.println(google.getPriceInformation());
        google.updatePrice(6);
        System.out.println(google.getPriceInformation());
        google.updatePrice(99);
        System.out.println(google.getPriceInformation());
        google.updatePrice(87);
        System.out.println(google.getPriceInformation());

    }
}
