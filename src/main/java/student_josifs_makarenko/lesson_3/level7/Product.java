package student_josifs_makarenko.lesson_3.level7;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    double regularPrice;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double discount;

    void calculationAfterPrice(){
        double discountPrice;
        discountPrice = getRegularPrice() * getDiscount() / 100;
        double afterPrice;
        afterPrice =  getRegularPrice() - discountPrice;
        System.out.println("Price of " + getName() + " is " + afterPrice);
    }
}
