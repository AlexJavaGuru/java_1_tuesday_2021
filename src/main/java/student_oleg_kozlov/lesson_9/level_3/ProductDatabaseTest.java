package student_oleg_kozlov.lesson_9.level_3;

import java.util.Optional;

// Task_8, // Task_10
class ProductDatabaseTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        shouldAddProductTest();
        shouldFindProductTest();
        shouldReturnNullIfProductNotFoundTest();
        shouldAddProductTestOpt();
        shouldFindProductTestOpt();
        shouldReturnEmptyInstanceIfProductNotFoundTestOpt();
        printFooter();
    }

    private static void shouldAddProductTest() {
        totalRun++;
        Product product = new Product("Product 1");
        InMemoryDatabaseImpl db = new InMemoryDatabaseImpl();
        db.save(product);
        checkResult(product, db.products[0],"shouldAddProductTest");
    }

    private static void shouldFindProductTest() {
        totalRun++;
        Product product = new Product("Product 2");
        InMemoryDatabaseImpl db = new InMemoryDatabaseImpl();
        db.save(product);
        checkResult(product, db.findByTitle("Product 2"),"shouldFindProductTest");
    }

    private static void shouldReturnNullIfProductNotFoundTest() {
        totalRun++;
        Product product = new Product("Product 3");
        InMemoryDatabaseImpl db = new InMemoryDatabaseImpl();
        db.save(product);
        checkResult(null,  db.findByTitle("Product 4"),"shouldReturnNullIfProductNotFoundTest");
    }

    private static void shouldAddProductTestOpt() {
        totalRun++;
        Product product = new Product("Product 1 Opt");
        InMemoryDatabaseOptImpl db = new InMemoryDatabaseOptImpl();
        db.save(product);
        checkResult(product, db.products[0],"shouldAddProductTestOpt");
    }

    private static void shouldFindProductTestOpt() {
        totalRun++;
        Product product = new Product("Product 2 Opt");
        InMemoryDatabaseOptImpl db = new InMemoryDatabaseOptImpl();
        db.save(product);
        Optional<Product> optionalProduct = db.findByTitle("Product 2 Opt");
        checkResult(product, optionalProduct.isPresent() ? optionalProduct.get() : new Product(""),"shouldFindProductTestOpt");
    }

    private static void shouldReturnEmptyInstanceIfProductNotFoundTestOpt() {
        totalRun++;
        Product product = new Product("Product 3 Opt");
        InMemoryDatabaseOptImpl db = new InMemoryDatabaseOptImpl();
        db.save(product);
        Optional<Product> optionalProduct = db.findByTitle("Product 4 Opt");
        checkResult(new Product(""),  optionalProduct.isPresent() ? optionalProduct.get() : new Product(""),"shouldReturnEmptyInstanceIfProductNotFoundTestOpt");
    }

    private static void checkResult(Product expected, Product actual, String testName) {
        if (compare(expected, actual)) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }

    private static boolean compare(Product expected, Product actual) {
        if (expected == null && actual == null) {
            return  true;
        }
        if (expected == null || actual == null) {
            return false;
        }
        return expected.equals(actual);
    }
}
