package student_einars_marhilevics.lesson_7.level_7;

class WordService {
    public String findMostFrequentWord(String text) {
        String myText = text.toLowerCase();
        String[] textArray = myText.split(" ");
        int[] wordCountArray = wordsAmount(textArray);
        int index = getIndexOfWord(wordCountArray);
        return textArray[index];
    }

    private int[] wordsAmount(String[] textArray) {
        int wordCounter = 0;
        int[] wordCountArray = new int[textArray.length];
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s) && !textArray[wordCount].equals("")) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
        return wordCountArray;
    }

    private int getIndexOfWord(int[] textArray) {
        int max = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] > max) {
                max = i;
            }
        }
        return max;
    }
}
