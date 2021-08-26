package student_ruslan_pankratov.lesson_2.level_7;
//Task_31
class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.discount = 30;
        product.regularPrice = 2;
        product.printInformation();
    }

}