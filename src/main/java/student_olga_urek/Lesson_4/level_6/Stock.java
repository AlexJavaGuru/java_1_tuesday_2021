package student_olga_urek.Lesson_4.level_6;

class Stock {
    String companyName;
    private int currentPrice;
    private int maximalPrice;
    private int minimalPrice;


    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maximalPrice = currentPrice;
        this.minimalPrice =currentPrice;
    }
    public void updatePrice(int newPrice) {
        if (newPrice >= this.maximalPrice) {
            this.maximalPrice = newPrice;
        }
        if (newPrice < this.minimalPrice) {
            this.minimalPrice = newPrice;
        }
        this.currentPrice = newPrice;
    }

    public int getMaximalPrice () {
        return maximalPrice;
    }

    public int getMinimalPrice () {
        return minimalPrice;
    }

    void getPriceInformation () {
        System.out.println("The current price of " + companyName + " stocks is " + currentPrice + "!");
        System.out.println("The maximal price of these stocks was " + getMaximalPrice() + ", and the minimal price was " + getMinimalPrice());
    }

}
