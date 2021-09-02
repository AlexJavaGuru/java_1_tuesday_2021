package student_einars_marhilevics.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Google",10);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(15);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(7);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(14);
        System.out.println(stock.getPriceInformation());
    }
}
