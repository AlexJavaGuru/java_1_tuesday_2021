package student_einars_marhilevics.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
    }
    void updatePriceTest() {
        int priceOne = 10;
        int priceTwo = 12;
        int priceThree = 5;
        int priceFour = 7;
        int priceFive = 99;
        int priceSix = 77;
        String expectedResultOne = "Company = Google, Current Price = 10, Min Price = 10, Max Price = 10";
        String expectedResultTwo = "Company = Google, Current Price = 12, Min Price = 10, Max Price = 12";
        String expectedResultThree = "Company = Google, Current Price = 5, Min Price = 5, Max Price = 12";
        String expectedResultFour = "Company = Google, Current Price = 7, Min Price = 5, Max Price = 12";
        String expectedResultFive = "Company = Google, Current Price = 99, Min Price = 5, Max Price = 99";
        String expectedResultSix = "Company = Google, Current Price = 77, Min Price = 5, Max Price = 99";
        Stock stock = new Stock("Google",10);
        stock.updatePrice(priceOne);
        String realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultOne)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }

        stock.updatePrice(priceTwo);
        realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultTwo)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }
        stock.updatePrice(priceThree);
        realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultThree)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }
        stock.updatePrice(priceFour);
        realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultFour)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }
        stock.updatePrice(priceFive);
        realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultFive)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }
        stock.updatePrice(priceSix);
        realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResultSix)) {
            System.out.println("Test updatePrice = OK");
        } else {
            System.out.println("Test updatePrice = Fail");
        }
    }
}
