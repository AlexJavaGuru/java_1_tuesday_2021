package student_ruslan_pankratov.lesson_7.level_5;
//Task_9
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.exponentiationTest();
    }
    void exponentiationTest(){
      int result = PowerCalculator.exponentiation(5,6);
      int expectedResult = 15625;

      if(result == expectedResult){
          System.out.println("exponentiationTest = OK");
      } else {
          System.out.println("exponentiationTest = FAIL");
      }

    }
}
