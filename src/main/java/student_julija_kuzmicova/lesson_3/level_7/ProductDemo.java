package student_julija_kuzmicova.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Product");

        product.regularPrice = 150;
        product.discount = 20;

        product.printInformation();
    }

}
