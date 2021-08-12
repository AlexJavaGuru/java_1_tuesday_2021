package student_oleg_kozlov.lesson_3.level_7;

// Task_31
class Product {

    private String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    private double actualPrice() {
        return regularPrice * discount / 100;
    }

    public void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Regular price = " + regularPrice);
        System.out.println("Discount = " + discount);
        System.out.println("Actual price = " + actualPrice());
    }
}
