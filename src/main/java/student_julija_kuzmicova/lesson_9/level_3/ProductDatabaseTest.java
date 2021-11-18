package student_julija_kuzmicova.lesson_9.level_3;

import java.util.Optional;

//Task_8, Task_10
class ProductDatabaseTest {

    InMemoryDatabaseImpl productDatabase = new InMemoryDatabaseImpl();
    Product phone = new Product("Phone");
    Product watch = new Product("Watch");
    Product car = new Product("Car");
    InMemoryDatabaseOptionalImpl productDatabaseOptional = new InMemoryDatabaseOptionalImpl();

    public static void main(String[] args) {
        ProductDatabaseTest test = new ProductDatabaseTest();
        test.saveTest();
        test.findByTitleTest();
        test.findByTitleReturnsNullTest();
        test.saveOptionalTest();
        test.findByTitleOptionalTest();
        test.findByTitleReturnsNullOptionalTest();
    }

    void saveTest() {
        productDatabase.save(phone);
        productDatabase.save(watch);
        checkResult(phone, productDatabase.productBase[0], "saveTest1");
        checkResult(watch, productDatabase.productBase[1], "saveTest2");
    }

    void findByTitleTest() {
        checkResult(watch, productDatabase.findByTitle("Watch"),"findByTitleTest");
    }

    void findByTitleReturnsNullTest() {
        checkResult(null, productDatabase.findByTitle("Car"),"findByTitleReturnsNullTest");
    }

    void saveOptionalTest() {
        productDatabaseOptional.save(phone);
        productDatabaseOptional.save(watch);
        checkResult(phone, productDatabaseOptional.productBase[0], "saveOptionalTest1");
        checkResult(watch, productDatabaseOptional.productBase[1], "saveOptionalTest2");
    }

    void findByTitleOptionalTest() {
        Optional<Product> optionalProduct = productDatabaseOptional.findByTitle("Watch");
        checkResult(watch, optionalProduct.get(),"findByTitleOptionalTest");
    }

    void findByTitleReturnsNullOptionalTest() {
        Optional<Product> optionalProduct = productDatabaseOptional.findByTitle("Car");
        checkResult(false, optionalProduct.isPresent(), "findByTitleReturnsNullOptionalTest");
    }

    void checkResult(Product expectedResult, Product actualResult, String testName){
        if(expectedResult == null && actualResult == null) {
            System.out.println(testName + " has passed");
        } else if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
