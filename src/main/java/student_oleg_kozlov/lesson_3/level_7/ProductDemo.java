package student_oleg_kozlov.lesson_3.level_7;

// Task_31
class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Computer");

        product.regularPrice = 500;
        product.discount = 50;

        product.printInformation();
    }

}
