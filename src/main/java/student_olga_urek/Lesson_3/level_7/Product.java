package student_olga_urek.Lesson_3.level_7;
//Task 31
class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice () {
        double actualPrice;
        actualPrice = regularPrice - (regularPrice * discount/100);
        return actualPrice;
    }

    void printInformation () {
        System.out.println("The full price of " + name + " is " + regularPrice + "EUR. Today we offer the discount of " + discount + "%!"  );
        System.out.println("Today you can buy " + name + " for " + actualPrice() + "EUR");
    }

}
