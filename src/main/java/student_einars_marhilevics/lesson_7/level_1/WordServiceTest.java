package student_einars_marhilevics.lesson_7.level_1;


import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.removeSymbolsAndSpaces();
        wordServiceTest.toLowerCase();
        wordServiceTest.splitString();
        wordServiceTest.findMostFrequentWord();
    }
    void removeSymbolsAndSpaces() {
        WordService wordService = new WordService();
        String string = "I will go Home,You-will go-home they will,stay Home";
        String expectedResult = "I will go Home You will go home they will stay Home";
        String result = wordService.removeSymbolsAndSpaces(string);
        check(result.equals(expectedResult), "removeSymbolsAndSpaces");
    }
    void toLowerCase() {
        WordService wordService = new WordService();
        String string = "I Will go,You will.";
        String expectedResult = "i will go,you will.";
        String result = wordService.toLowerCase(string);
        check(result.equals(expectedResult), "toLowerCase");
    }
    void splitString() {
        WordService wordService = new WordService();
        String string = "I will go Home,You will Go-home,they Will stay Home";
        String[] expectedResult = {"i", "will", "go", "home", "you", "will", "go", "home", "they", "will", "stay", "home"};
        String[] result = wordService.splitString(string);
        check(Arrays.equals(result, expectedResult), "splitString");
    }
    void findMostFrequentWord() {
        WordService wordService = new WordService();
        String string = "I will go, You You will go-but they you will you stay";
        String expectedResult = "you";
        String result = wordService.findMostFrequentWord(string);
        check(result.equals(expectedResult), "findMostFrequentWord");
    }
    void check (boolean condition, String test) {
        if(condition) {
            System.out.println(test + " passed");
        } else {
            System.out.println(test + " failed");
        }
    }
}
