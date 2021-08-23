package student_einars_marhilevics.lesson_3.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product (String name) {this.name = name;}

    double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }
    void printInformation() {
        System.out.println(name + " price is " + regularPrice + " EUR");
        System.out.println("Discount is " + discount + " %");
        System.out.println("New price is " + actualPrice() + " EUR");
    }

}
