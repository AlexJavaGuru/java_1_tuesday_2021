package student_einars_marhilevics.lesson_9.level_3;

import java.util.Optional;

public class ProductDatabaseTest {
    public static void main(String[] args) {
        ProductDatabaseTest productDatabaseTest = new ProductDatabaseTest();
        productDatabaseTest.save();
        productDatabaseTest.findByTitle();
        productDatabaseTest.saveOptional();
        productDatabaseTest.findByTitleOptional();
    }

    void save() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Apple");
        inMemoryDatabase.save(product);
        Product result = inMemoryDatabase.products[0];
        check(result == product, "Test SAVE");
    }

    void findByTitle() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Apple");
        inMemoryDatabase.save(product);
        Product result = inMemoryDatabase.findByTitle("Apple");
        check(result == product, "Test FIND");
    }

    void saveOptional() {
        InMemoryDatabaseOptional inMemoryDatabaseOptional = new InMemoryDatabaseOptional();
        Product product = new Product("Apple");
        inMemoryDatabaseOptional.save(product);
        Product result = inMemoryDatabaseOptional.products[0];
        check(result == product, "Test Optional SAVE");
    }

    void findByTitleOptional() {
        InMemoryDatabaseOptional inMemoryDatabaseOptional = new InMemoryDatabaseOptional();
        Product product = new Product("Apple");
        inMemoryDatabaseOptional.save(product);
        Optional<Product> result = inMemoryDatabaseOptional.findByTitle("Apple");
        check(result.equals(Optional.of(product)), "Test Optional FIND");
    }


        void check(boolean condition, String testName){
            if (condition) {
                System.out.println(testName + " passed");
            } else {
                System.out.println(testName + " failed");
            }
        }
    }

