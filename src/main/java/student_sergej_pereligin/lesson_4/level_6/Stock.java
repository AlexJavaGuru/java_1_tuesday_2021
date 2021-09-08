package student_sergej_pereligin.lesson_4.level_6;

public class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;

        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }


    String getPriceInformation() {
        String priceInformation = "Stock name: " + name + ", current price: " + currentPrice + " , min price " + minPrice + " , max price " + maxPrice;
        return priceInformation;
    }

}
