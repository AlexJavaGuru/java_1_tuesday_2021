package student_oleg_kozlov.lesson_4.level_6;

// Task_17
class StockTest {

    // Define color constants
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";
    private static final String TEXT_YELLOW = "\u001B[33m";

    private int totalRun = 0;
    private int totalPassed = 0;
    private int totalFailed = 0;

    public static void main(String[] args) {
        StockTest stockTest = new StockTest(); // Create an instance as static method can't run non-static methods
        stockTest.stockUpdatePriceTest();
        stockTest.printFooter(); // Print totals
    }

    private void stockUpdatePriceTest() {
        String realResult;
        String expectedResult;

        // Prepare data for testing
        String companyName = "Google";
        int[] newPrice = {10, 12, 5, 7, 99, 77};
        int[] expectedMinPrice = {10, 10, 5, 5, 5, 5};
        int[] expectedMaxPrice = {10, 12, 12, 12, 99, 99};

        // Run tested method for each value combinations
        System.out.println("--------------------------------------------");
        System.out.println("Tested price changing scenario: " + TEXT_YELLOW +
                "10 -> 12 -> 5 -> 7 -> 99 -> 77" + TEXT_RESET);
        Stock stock = new Stock(companyName, newPrice[0]);
        for (int i = 0; i < newPrice.length; i++) {
            totalRun++;
            expectedResult = "Company = " + "\"" + companyName + "\"" + ", Current Price = " + newPrice[i] +
                    ", Min Price = " + expectedMinPrice[i] + ", Max Price = " + expectedMaxPrice[i];
            if (i > 0) {
                stock.updatePrice(newPrice[i]);
            }
            realResult = stock.getPriceInformation();
            check(expectedResult, realResult, "Test Case " + (i + 1));
        }
    }

    private void check(String expectedResult, String actualResult, String testCase) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(TEXT_GREEN + testCase + " passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testCase + " failed");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual:   " + actualResult + TEXT_RESET);
            totalFailed++;
        }
    }

    private void printFooter() {
        System.out.println("\n********************************************");
        System.out.println("TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed + "; FAILED = " + totalFailed);
        System.out.println("********************************************");
    }
}
