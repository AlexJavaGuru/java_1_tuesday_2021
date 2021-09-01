package student_josifs_makarenko.lesson_4.level6;

public class Stock {
    String name;
    int realPrice;
    int maxPrice;
    int minPrice;

    Stock (String name, int realPrice) {
        this.name = name;
        this.realPrice = realPrice;
        maxPrice = realPrice;
        minPrice = realPrice;
    }

    public void updatePrice(int newPrice) {
        realPrice = newPrice;
        if (newPrice >= maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice <= minPrice) {
            minPrice = newPrice;
        }
    }

    public void getPriceInformation() {
        System.out.println("Company = " + name + ", Max price = " + maxPrice + ", Min price = " + minPrice);
    }
}
