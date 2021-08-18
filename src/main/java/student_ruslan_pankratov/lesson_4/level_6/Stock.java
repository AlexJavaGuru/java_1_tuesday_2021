package student_ruslan_pankratov.lesson_4.level_6;

class Stock {
    private String name;
    private int presentCost;
    private int minCost = 10;
    private int maxCost;


    public Stock(String name, int presentCost) {
        this.presentCost = presentCost;
        this.name = name;
    }

    void updatePrice(int newPrice) {
        this.presentCost = newPrice;
        if (newPrice > maxCost) {
            this.maxCost = newPrice;
        } else if (newPrice < minCost) {
            this.minCost = newPrice;
        }

    }

    String getPriceInformation() {
        String result = "Company = " + name + ", Current Price = " + presentCost + ", Min Price = " + minCost +
                ", Max Price = " + maxCost;
        return result;

    }


}

