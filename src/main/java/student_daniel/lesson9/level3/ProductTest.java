package student_daniel.lesson9.level3;

import java.util.Objects;
import java.util.Optional;

public class ProductTest {
    //Task 8 10
    public static void main(String[] args) {
        ProductTest myTest = new ProductTest();
        myTest.saveTest();
        myTest.findByTitleTest();
        myTest.findByTitleOptionalTest();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Test
    void saveTest() {
        Product testProduct = new Product("Banana");
        InMemoryDatabase productList = new InMemoryDatabase();
        productList.save(testProduct);
        String expectedResult = "Banana";
        String actualResult = productList.myProducts[0].getTitle();
        check(expectedResult, actualResult, "Product added to the Database: " + testProduct.getTitle());
    }

    void findByTitleTest() {
        Product testProduct = new Product("Cherry");
        InMemoryDatabase productList = new InMemoryDatabase();
        productList.save(testProduct);
        Product searchProduct = productList.findByTitle("Cherry");
        String expectedResult = "Cherry";
        String actualResult = searchProduct.getTitle();
        check(expectedResult, actualResult, "Product is found in Database: "  + actualResult);
    }

    void findByTitleOptionalTest() {
        Product testProduct = new Product("Apple");
        InMemoryDatabaseOptional productList = new InMemoryDatabaseOptional();
        productList.save(testProduct);
        Optional<Product> searchProduct = productList.findByTitle("Apple");
        String expectedResult = "Apple";
        String actualResult = searchProduct.get().getTitle();
        check(expectedResult, actualResult, "Product is found in Database (Optional): " + actualResult);
    }

    void check(Product expectedResult, Product actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
