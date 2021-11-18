package student_josifs_makarenko.lesson_9.level3;

public class InMemoryDatabaseTest {
//task 8
    public static void main(String[] args) {
        findRealProduct();
        findUnrealProduct();
    }

    static void findRealProduct() {
        ProductDatabase productDatabase = new InMemoryDatabase();
        Product product = new Product("Apple");
        productDatabase.save(product);
        check(productDatabase.findByTitle("Apple").equals(product),"FindRealProduct TEST" );
    }

    static void findUnrealProduct() {
        ProductDatabase productDatabase = new InMemoryDatabase();
        check(productDatabase.findByTitle("Apple") == null,"FindUnrealProduct TEST" );
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
