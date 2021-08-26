package student_einars_marhilevics.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Google",10);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(20);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(50);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(5);
        System.out.println(stock.getPriceInformation());
    }
}
