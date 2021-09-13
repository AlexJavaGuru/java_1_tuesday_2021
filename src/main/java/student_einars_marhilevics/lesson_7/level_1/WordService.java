package student_einars_marhilevics.lesson_7.level_1;

import java.util.Arrays;


class WordService {
    String findMostFrequentWord(String text) {
        String textWithoutSymbols = toLowerCase(text);
        String[] split = splitString(textWithoutSymbols);
        Arrays.sort(split);
        int max = 0;
        int count = 1;
        String word = split[0];
        String curr = split[0];
        for (int i = 1; i < split.length; i++) {
            if (split[i].equals(curr) && !split[i].equals("")) {
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

    String toLowerCase(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase;
    }

    public String[] splitString(String str) {
        String myString = removeSymbolsAndSpaces(str.toLowerCase());
        return myString.split(" ");
    }
}
