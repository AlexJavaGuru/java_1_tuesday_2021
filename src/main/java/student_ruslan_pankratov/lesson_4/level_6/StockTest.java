package student_ruslan_pankratov.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();

    }


    public void updatePriceTest() {
        int firtsNumber = 10;
        int secondNumber = 12;
        int thirdNumber = 5;
        int fourthNumber = 7;
        int fifthNumber = 99;
        int sixth = 77;
        String expectedResult = "Company = Samsung, Current Price = 77, Min Price = 5, Max Price = 99";

        Stock stock = new Stock("Samsung", 10);
        stock.updatePrice(firtsNumber);
        stock.updatePrice(secondNumber);
        stock.updatePrice(thirdNumber);
        stock.updatePrice(fourthNumber);
        stock.updatePrice(fifthNumber);
        stock.updatePrice(sixth);

        String actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResult)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }

    }

}


