package student_daniel.lesson4.level6;

class Stock {
    //Task 17
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice, int minPrice, int maxPrice) {
        this.companyName = companyName;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.currentPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice >= maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice <= minPrice) {
            minPrice = newPrice;
        }
    }

    String getPriceInformation() {
        String result = "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
        return result;
    }
}
