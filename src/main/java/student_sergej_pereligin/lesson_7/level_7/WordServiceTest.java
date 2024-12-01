package student_sergej_pereligin.lesson_7.level_7;


public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testPreCorrection();
        wordServiceTest.splitTest();
        wordServiceTest.wordCountTest();
        wordServiceTest.findMaxTest();

    }

    public void testPreCorrection(){
        String string = "I am am am not a beast!";
        WordService wordService = new WordService();
        String expectedResult = "am";
        String actualResult = wordService.findMostFrequentWord(string);
        checkResults(true, "testPreCorrection");

    }


    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }

    public void checkResults(int expectedResult, int actualResult, String name){
        if (expectedResult == actualResult){
            System.out.println("Test " + name + " passed!");
        }
        else{
            System.out.println("Test " + name + " failed!");
        }
    }

    public void splitTest(){
        WordService wordService = new WordService();
        String string = "i am am am not a beast";
        String [] expectedResult = {"i, am, am, am, not, a, beast"};
        String [] actualResult = wordService.splitStringCorrection(string);
        checkResults(true, "splitTheStringTest");
    }

    public void wordCountTest(){
        WordService wordService = new WordService();
        String [] string =  {"i", "am", "am", "am", "not", "a", "beast"};
        int expectedResult = 7;
        int actualResult = wordService.wordCountCorrection(string);
        checkResults(expectedResult, actualResult, "wordCountTest");
    }

    public void findMaxTest(){
        String [] stuff = {"i, am, am, am, not, a, beast"};
        WordService wordService = new WordService();
        String expectedResult = "am";
        String actualResult = wordService.findMaxCorrection(stuff);
        checkResults(true, "maxWordTest");
    }

}
