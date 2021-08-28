package student_josifs_makarenko.lesson_4.level6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest1();
        stockTest.updatePriceTest2();
        stockTest.updatePriceTest3();
        stockTest.updatePriceTest4();
        stockTest.updatePriceTest5();
        stockTest.updatePriceTest6();
        stockTest.updatePriceTest7();
        stockTest.updatePriceTest8();
        stockTest.updatePriceTest9();
        stockTest.updatePriceTest10();
    }

    public void updatePriceTest1() {
        Stock stock = new Stock("google", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        int expectedResult = 999;
        int realResult = stock.maxPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest2() {
        Stock stock = new Stock("google", 10);
        int newPrice = 999;
        int expectedResult = 999;
        int realResult = stock.updatePrice(newPrice);
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest3() {
        Stock stock = new Stock("google", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        int expectedResult = 1000;
        int realResult = stock.maxPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest4() {
        Stock stock = new Stock("google", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int expectedResult = 1000;
        int realResult = stock.maxPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest5() {
        Stock stock = new Stock("google", 10);
        stock.updatePrice(9);
        stock.updatePrice(27);
        int expectedResult = 27;
        int realResult = stock.maxPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest6() {
        Stock stock = new Stock("Mazila", 10);
        stock.updatePrice(9);
        int expectedResult = 9;
        int realResult = stock.minPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest7() {
        Stock stock = new Stock("Mazila", 10);
        stock.updatePrice(9);
        stock.updatePrice(11);
        int expectedResult = 9;
        int realResult = stock.minPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest8() {
        Stock stock = new Stock("Mazila", 10);
        stock.updatePrice(9);
        stock.updatePrice(11);
        stock.updatePrice(8);
        int expectedResult = 8;
        int realResult = stock.minPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest9() {
        Stock stock = new Stock("Mazila", 10);
        stock.updatePrice(9);
        stock.updatePrice(11);
        stock.updatePrice(8);
        stock.updatePrice(12);
        int expectedResult = 8;
        int realResult = stock.minPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void updatePriceTest10() {
        Stock stock = new Stock("Mazila", 10);
        stock.updatePrice(15);
        stock.updatePrice(5);
        int expectedResult = 5;
        int realResult = stock.minPrice;
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void check(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK" + " " + realResult);
        }
    }
}
