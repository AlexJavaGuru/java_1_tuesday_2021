package student_sergej_pereligin.lesson_7.level_1;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        WordServiceTest.splitTheStringTest();
        WordServiceTest.maxWordTest();
    }



    public static void splitTheStringTest() {
        String stuff = "I love love love my cat";
        WordService wordService = new WordService();
        String [] expectedResult = {"I, love, love, love, my, cat"};
        String [] actualResult = WordService.splitTheString(stuff);
        checkResults(true, "splitTheStringTest");


    }

    public static void maxWordTest(){
        String [] stuff = {"I, love, love, love, my, cat"};
        WordService wordService = new WordService();
        String expectedResult = "love";
        String actualResult = WordService.maxWord(stuff);
        checkResults(true, "maxWordTest");
    }

    static void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Teast " + testName + " failed!");
        }
    }

}