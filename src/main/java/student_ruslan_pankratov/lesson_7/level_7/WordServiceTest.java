package student_ruslan_pankratov.lesson_7.level_7;

//Task_13
class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWord();
    }

    void findMostFrequentWord() {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("1 2 3 1 2 3 1 1 2 1 win win 1");
        String expectedResult = "Самое частое слово или число = 1 было использовано: 6 раз";

        if (expectedResult.equals(result)) {
            System.out.println("Test findMostFrequentWord = OK");
        } else {
            System.out.println("Test findMostFrequentWord = FAIL");
        }

    }
}
