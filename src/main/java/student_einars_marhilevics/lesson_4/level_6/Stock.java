package student_einars_marhilevics.lesson_4.level_6;

class Stock {
    String name;
    int minPrice;
    int maxPrice;
    int currentPrice;


    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;

    }

    void updatePrice(int newPrice) {

        this.currentPrice = newPrice;
        if (newPrice < this.minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else {
            minPrice = currentPrice;
            maxPrice = currentPrice;
        }
    }
}
    /*int getPriceInformation() {
        return this.currentPrice;
    }

}*/
