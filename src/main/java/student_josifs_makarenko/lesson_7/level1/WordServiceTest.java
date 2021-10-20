package student_josifs_makarenko.lesson_7.level1;

public class WordServiceTest {
    public static void main(String[] args) {
        transformToArrayTest();
        findEqualWordsTest();
    }

    static void transformToArrayTest() {
        WordService wordService = new WordService();
        String text = "Hello my name Josif";
        String[] textArray = {"Hello", "my", "name", "Josif"};
        check(checkArrays(textArray, wordService.transformToArray(text)), "transformToArrayTest");
     }

     static void findEqualWordsTest(){
        WordService wordService = new WordService();
         String[] textArray = {"Hello", "my", "name", "Josif", "what", "is", "your", "name"};
         check("name = 2".equals(wordService.findEqualWords(textArray)), "findEqualWordsTest");
     }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }

    public static boolean checkArrays (String[] firstArray, String[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
                return false;
            }
        }
        return true;
    }
}
