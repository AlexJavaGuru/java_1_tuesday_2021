package student_einars_marhilevics.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("TV");
        product.regularPrice = 800;
        product.discount = 20;
        product.printInformation();
    }
}
