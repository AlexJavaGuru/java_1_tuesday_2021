package student_einars_marhilevics.lesson_7.level_1;

import java.util.Arrays;

class WordService {
    String findMostFrequentWord(String text) {
        String textWithoutSymbols = removeSymbolsAndSpaces(text);
        String[] split = splitString(textWithoutSymbols);
        Arrays.sort(split);
        int max = 0;
        int count = 1;
        String word = split[0];
        String curr = split[0];
        for (int i = 1; i < split.length; i++) {
            if (split[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = split[i];
            }
            if (max < count) {
                max = count;
                word = split[i];
            }
        }
        return word;
    }

    String removeSymbolsAndSpaces(String str) {
        return str.replaceAll("[^\\dA-Za-z ]", " ");
    }

    public String[] splitString(String str) {
        return str.split(" ");
    }
}
