package student_ruslan_pankratov.lesson_7.level_1;

//Task_1-5

class WordService {

    static public String findMostFrequentWord(String text) {
        String result = count(delimiter(text));
        return result;
    }

    static String[] delimiter(String text) {

        String[] str = text.split("\\s");
        return str;


    }


    static String count(String[] text) {
        int countOne;
        int max = 0;
        String result = "";
        for (int i = 0; i < text.length; i++) {

            countOne = 1;
            for (int j = i + 1; j < text.length; j++) {
                if (text[j].equals(text[i])) {
                    countOne = countOne + 1;
                }
                if (text.length - 1 == j && countOne > max) {
                    max = countOne;

                    result = text[i] + " = " + max;

                }
            }

        }
        return result;


    }


}
