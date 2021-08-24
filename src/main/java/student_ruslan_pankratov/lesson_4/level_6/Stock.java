package student_ruslan_pankratov.lesson_4.level_6;

class Stock {
    private String name;
    private int presentCost;
    private int minCost;
    private int maxCost;


    public Stock(String name, int presentCost) {
        this.presentCost = presentCost;
        this.name = name;
        this.minCost = presentCost;
        this.maxCost = presentCost;
    }

    void updatePrice(int newPrice) {
        presentCost = newPrice;
        if (newPrice > maxCost) {
            maxCost = newPrice;
        } else if (newPrice < minCost) {
            minCost = newPrice;
        }

    }

    String getPriceInformation() {
        String result = "Company = " + name + ", Current Price = " + presentCost + ", Min Price = " + minCost +
                ", Max Price = " + maxCost;
        return result;

    }


}

