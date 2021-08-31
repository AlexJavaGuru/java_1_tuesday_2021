package student_einars_marhilevics.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTestOne();
        stockTest.updatePriceTestTwo();
        stockTest.updatePriceTestThree();
        stockTest.updatePriceTestFour();
        stockTest.updatePriceTestFive();
        stockTest.updatePriceTestSix();
    }
    void updatePriceTestOne() {
        int priceOne = 10;
        String expectedResult = "Company = Google, Current Price = 10, Min Price = 10, Max Price = 10";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price one test");
    }
    void updatePriceTestTwo() {
        int priceOne = 10;
        int priceTwo = 12;
        String expectedResult = "Company = Google, Current Price = 12, Min Price = 10, Max Price = 12";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price two test");
    }
    void updatePriceTestThree() {
        int priceOne = 10;
        int priceTwo = 12;
        int priceThree = 5;
        String expectedResult = "Company = Google, Current Price = 5, Min Price = 5, Max Price = 12";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price three test");
    }
    void updatePriceTestFour() {
        int priceOne = 10;
        int priceTwo = 12;
        int priceThree = 5;
        int priceFour = 7;
        String expectedResult = "Company = Google, Current Price = 7, Min Price = 5, Max Price = 12";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);
        stock.updatePrice(priceFour);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price four test");
    }
    void updatePriceTestFive() {
        int priceOne = 10;
        int priceTwo = 12;
        int priceThree = 5;
        int priceFour = 7;
        int priceFive = 99;
        String expectedResult = "Company = Google, Current Price = 99, Min Price = 5, Max Price = 99";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);
        stock.updatePrice(priceFour);
        stock.updatePrice(priceFive);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price five test");
    }
    void updatePriceTestSix() {
        int priceOne = 10;
        int priceTwo = 12;
        int priceThree = 5;
        int priceFour = 7;
        int priceFive = 99;
        int priceSix = 77;
        String expectedResult = "Company = Google, Current Price = 77, Min Price = 5, Max Price = 99";
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(priceOne);
        stock.updatePrice(priceTwo);
        stock.updatePrice(priceThree);
        stock.updatePrice(priceFour);
        stock.updatePrice(priceFive);
        stock.updatePrice(priceSix);
        String realResult = stock.getPriceInformation();
        check(expectedResult, realResult, "price six test");
    }
        void check(String expectedResult, String realResult, String test) {
            if(expectedResult.equals(realResult)) {
                System.out.println(test + " passed");
            } else {
                System.out.println(test + " failed");
            }
        }


}
