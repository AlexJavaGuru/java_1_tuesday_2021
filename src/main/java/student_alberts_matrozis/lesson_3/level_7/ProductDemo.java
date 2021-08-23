package student_alberts_matrozis.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product phone = new Product("Iphone 11");
        phone.regularPrice = 100;
        phone.discount = 20;
        phone.printInformation();
    }
}
