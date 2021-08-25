package student_einars_marhilevics.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Google",10);
        System.out.println("min " + stock.minPrice);
        System.out.println("max " + stock.maxPrice);
        stock.updatePrice(20);
        System.out.println("min " + stock.minPrice);
        System.out.println("max " + stock.maxPrice);
        stock.updatePrice(50);
        System.out.println("min " + stock.minPrice);
        System.out.println("max " + stock.maxPrice);
    }
}
