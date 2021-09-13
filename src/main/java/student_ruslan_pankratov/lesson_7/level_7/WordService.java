package student_ruslan_pankratov.lesson_7.level_7;

//Task_13
class WordService {

    public String findMostFrequentWord(String text) {
        String[] arr = text.split(" ");
        String theMostFrequentWord = "";
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int countWords = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    countWords++;
                }
            }
            if (countWords > maxCount) {
                maxCount = countWords;
                theMostFrequentWord = "Самое частое слово или число = " + arr[i] + " было использовано: " + maxCount + " раз";
            }
        }
        return theMostFrequentWord;
    }
}
