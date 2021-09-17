package student_julija_kuzmicova.lesson_4.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock (String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice > maxPrice) {
            this.maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            this.minPrice = newPrice;
        }
        this.currentPrice = newPrice;
    }

    void getPriceInformation() {
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }

    int getMaxPrice() {
        return maxPrice;
    }

    int getMinPrice() {
        return minPrice;
    }

    int getCurrentPrice() {
        return currentPrice;
    }
}
