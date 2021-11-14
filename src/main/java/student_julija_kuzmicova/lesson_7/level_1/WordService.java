package student_julija_kuzmicova.lesson_7.level_1;

import java.util.Arrays;
import java.util.Locale;

//Task_1, Task_2, Task_3
class WordService {

    public String findMostFrequentWord(String text) {
        text = removePunctuationAndCase(text);
        String[] words = text.split("\\s");
        String[] wordsWithoutDuplicates = removeDuplicates(words);
        Arrays.sort(words);

        String word = "";
        String wordMax = "";
        int counter = 0;
        int max = 0;
        for(int i = 0; i < wordsWithoutDuplicates.length; i++) {
            if(wordsWithoutDuplicates[i] == null) {
                continue;
            }
            for(int j = 0; j < words.length; j++) {
                if(wordsWithoutDuplicates[i].equals(words[j])) {
                    word = wordsWithoutDuplicates[i];
                    counter++;
                } else if(!wordsWithoutDuplicates[i].equals(words[j])) {
                    counter = 0;
                }
                if(counter > max) {
                    max = counter;
                    wordMax = word;
                }
            }
        }
        System.out.println("Слово '" + wordMax + "' встречается в тексте: " + max + " раз.");
        return wordMax;
    }

    public String removePunctuationAndCase(String string) {
        string = string.replaceAll("[.,:;!?]", "");
        string = string.toLowerCase(Locale.ROOT);
        return string;
    }

    public String[] removeDuplicates(String[] arr) {
        String[] arrCopy = arr.clone();
        for(int i = 0; i < arrCopy.length-1; i++) {
            if(arrCopy[i].isBlank()){
                continue;
            }
            for(int j = i + 1; j < arrCopy.length; j++) {
                if(arrCopy[j].isBlank()){
                    continue;
                }
                if(arrCopy[i].equals(arrCopy[j])) {
                    arrCopy[j] = "";
                }
            }
        }
        String[] result = removeEmptyStrings(arrCopy);
        return result;
    }

    public String[] removeEmptyStrings(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isBlank()) {
                arr[i] = null;
            }
        }
        return arr;
    }
}
