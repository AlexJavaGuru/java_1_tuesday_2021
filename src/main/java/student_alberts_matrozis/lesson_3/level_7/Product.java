package student_alberts_matrozis.lesson_3.level_7;
// Task 31
class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation() {
        System.out.println("Name - " + name);
        System.out.println("Regular Price - " + regularPrice);
        System.out.println("Discount - " + discount + "%");
        System.out.println("Actual Price - " + actualPrice());
    }

}
