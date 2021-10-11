package student_einars_marhilevics.lesson_7.level_7;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testBigSmallLetters();
        wordServiceTest.testWhiteSpaces();
        /*wordServiceTest.testThree();*/
    }
    void testBigSmallLetters() {
        WordService wordService = new WordService();
        String string = "I will go, You You will go-but they you will you stay";
        String expectedResult = "you";
        String result = wordService.findMostFrequentWord(string);
        check(result.equals(expectedResult), "testBigSmallLetters");
    }
    void testWhiteSpaces() {
        WordService wordService = new WordService();
        String string = "I will go,,,,     You You will     go-but they you,,,    will,, you stay";
        String expectedResult = "you";
        String result = wordService.findMostFrequentWord(string);
        check(result.equals(expectedResult), "testWhiteSpaces");
    }
    void check (boolean condition, String test) {
        if(condition) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
