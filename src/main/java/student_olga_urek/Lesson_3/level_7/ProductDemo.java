package student_olga_urek.Lesson_3.level_7;
// Task 31

class ProductDemo {
    public static void main(String[] args){
        Product myProduct = new Product("an elephant");
        myProduct.setRegularPrice(150);
        myProduct.setDiscount(50);
        myProduct.printInformation();
    }
}
