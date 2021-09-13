package student_einars_marhilevics.lesson_7.level_1;


class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.removeSymbolsAndSpaces();
        /*wordServiceTest.splitString();
        wordServiceTest.findMostFrequentWord();*/
    }
    void removeSymbolsAndSpaces() {
        WordService wordService = new WordService();
        String string = "I will go,You will go-but they will stay";
        String expectedResult = "I will go  You will go but they will stay";
        String result = wordService.removeSymbolsAndSpaces(string);
        check(result.equals(expectedResult), "removeSymbolsAndSpaces");
    }
    void splitString() {
        WordService wordService = new WordService();
        String string = "I will go,You will go-but they will stay";
        //String[] expectedResult = "[I, will, go, You, will, go, but, they, will, stay]"];
        String result = wordService.removeSymbolsAndSpaces(string);
        //check(result.equals(expectedResult), "splitString");
    }
    void check (boolean condition, String test) {
        if(condition) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
