package student_josifs_makarenko.lesson_4.level6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
        stockTest.getPriceInformationTest1();
        stockTest.getPriceInformationTest2();
    }

    public void updatePriceTest () {
        Stock stock = new Stock("google", 10);
        int newPrice = 15;
        int expectedResult = 15;
        int realResult = stock.updatePrice(newPrice);
        check(expectedResult, realResult, "UpdatePriceTest");
    }

    public void getPriceInformationTest1() {
        Stock stock = new Stock("google", 10);
        stock.setMaxPrice(stock.getRealPrice());
        stock.setMinPrice(stock.getRealPrice());
        stock.updatePrice(15);
        int expectedResult = 15 & 10 & 15;
        int realResult = stock.getPriceInformation();
        check(expectedResult, realResult,  "GetPriceInformationTest");
    }

    public void getPriceInformationTest2() {
        Stock stock = new Stock("google", 10);
        stock.setMaxPrice(stock.getRealPrice());
        stock.setMinPrice(stock.getRealPrice());
        stock.updatePrice(8);
        int expectedResult = 10 & 8 & 8;
        int realResult = stock.getPriceInformation();
        check(expectedResult, realResult,  "GetPriceInformationTest");
    }

    public void check (int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult)  {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " != OK");
        }
    }
}
