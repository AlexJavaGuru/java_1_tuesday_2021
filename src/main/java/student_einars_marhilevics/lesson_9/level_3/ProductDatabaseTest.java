package student_einars_marhilevics.lesson_9.level_3;

public class ProductDatabaseTest {
    public static void main(String[] args) {
        ProductDatabaseTest productDatabaseTest = new ProductDatabaseTest();
        productDatabaseTest.save();
        productDatabaseTest.findByTitle();
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


        void check ( boolean condition, String testName){
            if (condition) {
                System.out.println(testName + " passed");
            } else {
                System.out.println(testName + " failed");
            }
        }
    }

