package student_olga_urek.Lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.scenarioOneMaxTest();
        stockTest.scenarioTwoMaxTest();
        stockTest.scenarioThreeMaxTest();
        stockTest.scenarioFourMaxTest();
        stockTest.scenarioFiveMaxTest();
        stockTest.scenarioOneMinTest();
        stockTest.scenarioTwoMinTest();
        stockTest.scenarioThreeMinTest();
        stockTest.scenarioFourMinTest();
        stockTest.scenarioFiveMinTest();
    }

    public void scenarioOneMaxTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        int expectedResult = 999;
        int realResult = myStock.getMaximalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioOneMaxTest = OK");
        } else {
            System.out.println("scenarioOneMaxTest = FAIL");
        }
    }

    public void scenarioTwoMaxTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        int expectedResult = 999;
        int realResult = myStock.getMaximalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioTwoMaxTest = OK");
        } else {
            System.out.println("scenarioTwoMaxTest = FAIL");
        }
    }
    public void scenarioThreeMaxTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);
        int expectedResult = 1000;
        int realResult = myStock.getMaximalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioThreeMaxTest = OK");
        } else {
            System.out.println("scenarioThreeMaxTest = FAIL");
        }
    }
    public void scenarioFourMaxTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);
        myStock.updatePrice(8);
        int expectedResult = 1000;
        int realResult = myStock.getMaximalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioFourMaxTest = OK");
        } else {
            System.out.println("scenarioFourMaxTest = FAIL");
        }
    }
    public void scenarioFiveMaxTest() {
        Stock myStock = new Stock("google", 9);
        myStock.updatePrice(27);
        int expectedResult = 27;
        int realResult = myStock.getMaximalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioFiveMaxTest = OK");
        } else {
            System.out.println("scenarioFiveMaxTest = FAIL");
        }
    }
    public void scenarioOneMinTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        int expectedResult = 10;
        int realResult = myStock.getMinimalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioOneMinTest = OK");
        } else {
            System.out.println("scenarioOneMinTest = FAIL");
        }
    }

    public void scenarioTwoMinTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        int expectedResult = 2;
        int realResult = myStock.getMinimalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioTwoMinTest = OK");
        } else {
            System.out.println("scenarioTwoMinTest = FAIL");
        }
    }
    public void scenarioThreeMinTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);
        int expectedResult = 2;
        int realResult = myStock.getMinimalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioThreeMinTest = OK");
        } else {
            System.out.println("scenarioThreeMinTest = FAIL");
        }
    }
    public void scenarioFourMinTest() {
        Stock myStock = new Stock("google", 10);
        myStock.updatePrice(999);
        myStock.updatePrice(2);
        myStock.updatePrice(1000);
        myStock.updatePrice(8);
        int expectedResult = 2;
        int realResult = myStock.getMinimalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioFourMinTest = OK");
        } else {
            System.out.println("scenarioFourMinTest = FAIL");
        }
    }
    public void scenarioFiveMinTest() {
        Stock myStock = new Stock("google", 9);
        myStock.updatePrice(27);
        int expectedResult = 9;
        int realResult = myStock.getMinimalPrice();
        if (realResult == expectedResult) {
            System.out.println("scenarioFiveMinTest = OK");
        } else {
            System.out.println("scenarioFiveMinTest = FAIL");
        }
    }
}
