package student_einars_marhilevics.lesson_4.level_6;

class Stock {
    String name;
    int minPrice;
    int maxPrice;
    int currentPrice;


    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }

    void updatePrice(int newPrice) {

        this.currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else {
            minPrice = currentPrice;
            maxPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        String prices = "Company = " + name + ", Current Price = " + currentPrice + ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;
        return prices;
    }

}
