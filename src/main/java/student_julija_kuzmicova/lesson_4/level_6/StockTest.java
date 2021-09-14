package student_julija_kuzmicova.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.maxOneTest();
        stockTest.maxTwoTest();
        stockTest.maxThreeTest();
        stockTest.maxFourTest();
        stockTest.maxFiveTest();
        stockTest.minOneTest();
        stockTest.minTwoTest();
        stockTest.minThreeTest();
        stockTest.minFourTest();
        stockTest.minFiveTest();
        stockTest.currentOneTest();
        stockTest.currentTwoTest();
        stockTest.currentThreeTest();
        stockTest.currentFourTest();
        stockTest.currentFiveTest();
    }

    void maxOneTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        int expectedResult = 12;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("maxOneTest = OK");
        } else {
            System.out.println("maxOneTest = FAIL");
        }
    }

    void maxTwoTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        int expectedResult = 12;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("maxTwoTest = OK");
        } else {
            System.out.println("maxTwoTest = FAIL");
        }
    }

    void maxThreeTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        int expectedResult = 12;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("maxThreeTest = OK");
        } else {
            System.out.println("maxThreeTest = FAIL");
        }
    }

    void maxFourTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        int expectedResult = 99;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("maxFourTest = OK");
        } else {
            System.out.println("maxFourTest = FAIL");
        }
    }

    void maxFiveTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 99;
        int realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("maxFiveTest = OK");
        } else {
            System.out.println("maxFiveTest = FAIL");
        }
    }

    void minOneTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        int expectedResult = 10;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("minOneTest = OK");
        } else {
            System.out.println("minOneTest = FAIL");
        }
    }

    void minTwoTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("minTwoTest = OK");
        } else {
            System.out.println("minTwoTest = FAIL");
        }
    }

    void minThreeTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("minThreeTest = OK");
        } else {
            System.out.println("minThreeTest = FAIL");
        }
    }

    void minFourTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("minFourTest = OK");
        } else {
            System.out.println("minFourTest = FAIL");
        }
    }

    void minFiveTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 5;
        int realResult = stock.getMinPrice();
        if (realResult == expectedResult) {
            System.out.println("minFiveTest = OK");
        } else {
            System.out.println("minFiveTest = FAIL");
        }
    }

    void currentOneTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        int expectedResult = 12;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("currentOneTest = OK");
        } else {
            System.out.println("currentOneTest = FAIL");
        }
    }

    void currentTwoTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        int expectedResult = 5;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("currentTwoTest = OK");
        } else {
            System.out.println("currentTwoTest = FAIL");
        }
    }

    void currentThreeTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        int expectedResult = 7;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("currentThreeTest = OK");
        } else {
            System.out.println("currentThreeTest = FAIL");
        }
    }

    void currentFourTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        int expectedResult = 99;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("currentFourTest = OK");
        } else {
            System.out.println("currentFourTest = FAIL");
        }
    }

    void currentFiveTest() {
        Stock stock = new Stock("Yandex", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int expectedResult = 77;
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("currentFiveTest = OK");
        } else {
            System.out.println("currentFiveTest = FAIL");
        }
    }
}
