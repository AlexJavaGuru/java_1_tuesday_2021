package student_alberts_matrozis.lesson_7.level_1;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest testRunner = new WordServiceTest();
        testRunner.WordServiceTest();
        testRunner.textSplitTest();
        testRunner.wordCounterTest();
    }

    public void textSplitTest() {
        String words = "Hello my name is John!";
        String[] exceptedResult = {"hello", "my", "name", "is", "john!"};
        WordService subject = new WordService();
        String[] receivedResult = subject.splitText(words);
        checkArrays(exceptedResult, receivedResult);
    }

    public void WordServiceTest() {
        String words = "jup word word word no hi hi hi this this hell word this this";
        WordService subject = new WordService();
        String receivedResult = subject.findMostFrequentWord(words);
        check(true, receivedResult.equals("word"));
    }

    public void wordCounterTest() {
        String words = "jup word word word no hi hi hi this this hell word this this";
        WordService subject = new WordService();
        int exceptedResult = 4;
        int receivedResult = subject.countWord(words, "word");
        check(exceptedResult, receivedResult);
    }
}
