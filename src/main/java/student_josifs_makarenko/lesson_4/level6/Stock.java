package student_josifs_makarenko.lesson_4.level6;

public class Stock {
    String name;
    int realPrice;
    int maxPrice;
    int minPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(int realPrice) {
        this.realPrice = realPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    Stock (String name, int realPrice) {
        setName(name);
        setRealPrice(realPrice);
    }

    public int updatePrice(int newPrice) {
        setRealPrice(newPrice);
        return newPrice;
    }

    public int getPriceInformation() {
        if (getMaxPrice() >= getRealPrice()) {
            setMaxPrice(getMaxPrice());
        } else {
            setMaxPrice(getRealPrice());
        }
        if (getMinPrice() <= getRealPrice()) {
            setMinPrice(getMinPrice());
        } else {
            setMinPrice(getRealPrice());
        }
        return getMaxPrice() & getMinPrice() & getRealPrice();
    }
    public void writePriceInformation() {
        System.out.println("Company = " + getName() + ", Current price = " + getRealPrice() + ", Max price = " + getMaxPrice() + ", Min price = " + getMinPrice());
    }
}
