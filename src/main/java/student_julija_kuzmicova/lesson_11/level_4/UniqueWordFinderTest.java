package student_julija_kuzmicova.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

//Task_27
class UniqueWordFinderTest {

    UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.findTest();
        test.findBlankTextTest();
    }

    void findTest() {
        String text = "If you fall asleep now, you will dream. If you study now, you will live your dream.";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("if");
        expectedResult.add("you");
        expectedResult.add("fall");
        expectedResult.add("asleep");
        expectedResult.add("now");
        expectedResult.add("will");
        expectedResult.add("dream");
        expectedResult.add("study");
        expectedResult.add("live");
        expectedResult.add("your");
        checkResult(expectedResult, uniqueWordFinder.find(text), "findTest");
    }

    void findBlankTextTest() {
        String text = ": ;";
        Set<String> expectedResult = new HashSet<>();
        checkResult(expectedResult, uniqueWordFinder.find(text), "findBlankTextTest");
    }

    void checkResult(Set<String> expectedResult, Set<String> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
