package student_sergej_pereligin.lesson_7.level_1;


public class WordService {

    public static void main(String[] args) {
        String sloths = "When I saw the sloth sloth sloth the sloth smiled back and so I knew that we are sloth friends now";
        String[] newSloth = splitTheString(sloths);
        System.out.println("Most frequent word is: " + maxWord(newSloth));
    }


    public static String[] splitTheString(String string) {
        return string.split(" ");
    }


    public static String maxWord(String[] array) {
        String max = "";
        String temp;
        int count = 0;
        int tempC;

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            tempC = 0;
            for (int j = 0; j < array.length; j++)
                if (array[j].equals(temp))
                    tempC++;
            if (tempC > count) {
                max = temp;
                count = tempC;
            }

        }
        return max;
    }
}