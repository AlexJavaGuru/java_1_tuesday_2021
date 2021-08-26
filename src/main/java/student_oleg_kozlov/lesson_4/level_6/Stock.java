package student_oleg_kozlov.lesson_4.level_6;

// Task_17
class Stock {

    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getPriceInformation() {
        return "Company = " + "\"" + name + "\"" + ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }
}
