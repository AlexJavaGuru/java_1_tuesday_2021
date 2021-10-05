package student_alberts_matrozis.lesson_7.level_7;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] splitted = splitText(text);
        String mostFrequentWord = null;
        int max = 0;
        for (String word : splitted) {
            int counted = countWord(text, word);
            if (max < counted) {
                max = counted;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }

    public String[] splitText(String text) {
        return text.toLowerCase().split(" ");
    }

    public int countWord(String text, String word) {
        String[] splitted = text
                .toLowerCase()
                .split(" ");
        int count = 0;
        for (String tempWord : splitted) {
            if (word.equals(tempWord)) {
                count++;
            }
        }
        return count;
    }
}