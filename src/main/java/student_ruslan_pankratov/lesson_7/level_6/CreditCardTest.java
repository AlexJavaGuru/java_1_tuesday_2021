package student_ruslan_pankratov.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
       CreditCardTest creditCardTest = new CreditCardTest();
       creditCardTest.depositTest();
       creditCardTest.withdrawTest();
       creditCardTest.depositRepaymentOfADebtTest();
       creditCardTest.withdrawWeBorrowTest();
       creditCardTest.withdrawNotEnoughMoneyTest();
    }

    void depositTest(){
    CreditCard creditCard = new CreditCard(7854342, 7777);
    creditCard.setCreditLimit(200);
    creditCard.deposit(7777,4000);

   int result = creditCard.getBalance();
   int expectedResult = 4000;
        methodTest(result,expectedResult,"depositTest");
   }

    void depositRepaymentOfADebtTest(){
        CreditCard creditCard = new CreditCard(7854342, 7777);
        creditCard.setCreditLimit(200);
        creditCard.withdraw(7777,200);
        creditCard.deposit(7777,4000);

        int result = creditCard.getBalance();
        int expectedResult = 3800;
        int resultTwo = creditCard.getLoanDebt();
        int expectedResultTwo = 0;
        methodTest(result,expectedResult,"depositRepaymentOfADebtTestBalance");
        methodTest(resultTwo,expectedResultTwo,"depositRepaymentOfADebtTestLoanDebt");
    }

    void withdrawTest(){
        CreditCard creditCard = new CreditCard(78543452, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777,4000);
        creditCard.withdraw(7777, 3000);
        int result = creditCard.getBalance();
        int expectedResult = 1000;
        methodTest(result,expectedResult,"withdrawTest");

    }

   void withdrawWeBorrowTest(){
       CreditCard creditCard = new CreditCard(78543452, 7777);
       creditCard.setCreditLimit(200);
       creditCard.deposit(7777,4000);
       creditCard.withdraw(7777, 4157);
       int result = creditCard.getLoanDebt();
       int expectedResult = 157;
       methodTest(result,expectedResult,"withdrawWeBorrow");

   }

    void withdrawNotEnoughMoneyTest(){
        CreditCard creditCard = new CreditCard(78543452, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777,4000);
        creditCard.withdraw(7777, 4600);
        int result = creditCard.getBalance();
        int expectedResult = 4000;
        methodTest(result,expectedResult,"withdrawNotEnoughMoney");

    }

   void methodTest(int result, int expectedResult, String name){
        if(result == expectedResult){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }


   }
}
