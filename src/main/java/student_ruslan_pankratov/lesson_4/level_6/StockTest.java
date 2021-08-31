package student_ruslan_pankratov.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();

    }


    public void updatePriceTest() {
        int firstNumber = 6;
        int secondNumber = 12;
        int thirdNumber = 5;
        int fourthNumber = 7;
        int fifthNumber = 99;
        int sixth = 77;
        String expectedResultFirst = "Company = Samsung, Current Price = 6, Min Price = 6, Max Price = 10";
        String expectedResultSecond = "Company = Samsung, Current Price = 12, Min Price = 6, Max Price = 12";
        String expectedResultThird = "Company = Samsung, Current Price = 5, Min Price = 5, Max Price = 12";
        String expectedResultFourth = "Company = Samsung, Current Price = 7, Min Price = 5, Max Price = 12";
        String expectedResultFifth = "Company = Samsung, Current Price = 99, Min Price = 5, Max Price = 99";
        String expectedResultSixth = "Company = Samsung, Current Price = 77, Min Price = 5, Max Price = 99";

        Stock stock = new Stock("Samsung", 10);
        stock.updatePrice(firstNumber);
        String actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultFirst)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }

        stock.updatePrice(secondNumber);
        actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultSecond)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }
        stock.updatePrice(thirdNumber);
        actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultThird)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }
        stock.updatePrice(fourthNumber);
        actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultFourth)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }
        stock.updatePrice(fifthNumber);
        actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultFifth)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }
        stock.updatePrice(sixth);
        actualResult = stock.getPriceInformation();
        if (actualResult.equals(expectedResultSixth)) {
            System.out.println("UpdatePrice = OK");
        } else {
            System.out.println("UpdatePrice = FAIL");
        }


    }

}


