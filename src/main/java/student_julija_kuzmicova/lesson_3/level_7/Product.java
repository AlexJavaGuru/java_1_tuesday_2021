package student_julija_kuzmicova.lesson_3.level_7;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product (String name){
        this.name = name;
    }

    double actualPrice(){
        return regularPrice - regularPrice * discount / 100;
    }

    void printInformation(){
        System.out.println("Product name: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Actual price: " + actualPrice());
    }


}
