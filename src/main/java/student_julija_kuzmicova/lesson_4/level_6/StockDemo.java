package student_julija_kuzmicova.lesson_4.level_6;

class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        google.getPriceInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.getPriceInformation();
    }
}
