package student_daniel.lesson3.level7;

class Product {
    //Task 31
    String name;
    double regularPrice;
    double discount;

    //Constructor
    Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    //Methods
    public double getActualPrice() {
        return regularPrice - regularPrice * discount;
    }

    void printInformation() {
        System.out.println(name);
        System.out.println(regularPrice + " Eur");
        System.out.println((int)(discount * 100) + " %");
        System.out.println(getActualPrice() + " Eur");
    }

}