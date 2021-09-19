package student_daniel.lesson4.level6;

class StockTest {
    //Task 17
    public static void main(String[] args) {
        StockTest myTest = new StockTest();
        myTest.updatePriceTest1();
        myTest.updatePriceTest2();
        myTest.updatePriceTest3();
        myTest.updatePriceTest4();
        myTest.updatePriceTest5();
        myTest.updatePriceTest6();
    }

    void updatePriceTest1() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        int expectedResult = 99;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest1 - ");
    }

    void updatePriceTest2() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(999);
        int expectedResult = 999;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest2 - ");
    }

    void updatePriceTest3() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(999);
        google.updatePrice(1);
        int expectedResult = 999;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest3 - ");
    }

    void updatePriceTest4() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(999);
        google.updatePrice(2);
        google.updatePrice(1000);
        int expectedResult = 1000;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest4 - ");
    }

    void updatePriceTest5() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(999);
        google.updatePrice(2);
        google.updatePrice(1000);
        google.updatePrice(8);
        int expectedResult = 1000;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest5 - ");
    }

    void updatePriceTest6() {
        Stock google = new Stock("GOOG", 10, 10, 10);
        google.updatePrice(9);
        google.updatePrice(27);
        int expectedResult = 27;
        int realResult = google.maxPrice;
        check(expectedResult, realResult, "Test name: updatePriceTest6 - ");
    }

    void check(int expectedResult, int realResult, String testName) {
        if(expectedResult == realResult) {
            System.out.println(testName + "Test PASSED");
        } else {
            System.out.println(testName + "Test FAILED");
        }
        System.out.println();
    }
}
