package student_josifs_makarenko.lesson_7.level1;

public class WordService {

    public String findMostFrequentWord(String text) {
        return findEqualWords(transformToArray(text));
    }
    String[] transformToArray(String text) {
        return text.split("\\s");
    }

    String findEqualWords (String[] textArray) {
        int count;
        int max = 0;
        String result = "";
        for (int i = 0; i < textArray.length; i++) {
            
            count = 1;
            for (int j = i + 1; j < textArray.length; j++) {
                if (textArray[j].equals(textArray[i])) {
                    count++;
                }
                
                if (j == textArray.length - 1 && count > max) {
                    max = count;
                    result = textArray[i] + " = " + max;
                }
            }
        }
        return result;
    }
}
