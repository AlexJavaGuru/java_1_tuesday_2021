package student_sergej_pereligin.lesson_7.level_7;


class WordService {

    public String findMostFrequentWord(String text) {
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
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }

    // ==============My attempt at correcting=======================//

    public String[] splitStringCorrection(String string) {
        return string.split(" ");
    }

    public int wordCountCorrection(String[]string) {
        int number = 0;
        for (int i = 0; i < string.length; i++) {
            number++;
        }
        return number;
    }

    public String findMaxCorrection(String[] array) {
        String max = "";
        String temp;
        int count = 0;
        int tempC;

        for (String s : array) {
            temp = s;
            tempC = 0;
            for (String value : array)
                if (value.equals(temp))
                    tempC++;
            if (tempC > count) {
                max = temp;
                count = tempC;
            }

        }
        return max;
    }
}

