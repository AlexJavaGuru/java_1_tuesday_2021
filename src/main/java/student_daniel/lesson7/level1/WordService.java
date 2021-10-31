package student_daniel.lesson7.level1;

public class WordService {
    //Test 1 2 3
    int max = 0;
    int count = 1;

    String findMostFrequentWord(String text) {
        String lowerCaseString = text.toLowerCase();
        String[] wordsArray = lowerCaseString.split(" ");
        String word = wordsArray[0];
        String current = wordsArray[0];

        for (int i = 1; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(current)) {
                count++;
            } else {
                count = 1;
                current = wordsArray[i];
            }

            if (max < count) {
                max = count;
                word = wordsArray[i];
            }
        }
        return word;
    }
}
