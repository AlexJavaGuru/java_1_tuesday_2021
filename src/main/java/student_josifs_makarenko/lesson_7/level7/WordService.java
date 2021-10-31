package student_josifs_makarenko.lesson_7.level7;

public class WordService {
//task_13
    public String findMostFrequentWordAfter(String text) {
        String[] textArray = text.split("\s");
        String word = " ";
        int max = 0;

        for (String value : textArray) {
            int count = 1;
            for (String s : textArray) {
                if (value.equals(s)) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                word = value;
            }
        }
        return word;
    }

    public String findMostFrequentWordBefore(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];

        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }

        int max = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }
}
