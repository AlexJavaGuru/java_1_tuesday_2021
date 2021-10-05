package student_daniel.lesson6;

public class EnchantedFor {
    public static void main(String[] args) {
        String[] stringsArray = {"Hello", "My", "Name", "Is", "Daniel"};
        //regular for, shortcut = fori
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println("fori " + stringsArray[i]);
        }

        //enchanted for
        for (String words : stringsArray) {
            System.out.println(words);
        }

        //shortcut = itar
        for (int i = 0; i < stringsArray.length; i++) {
            String s = stringsArray[i];
            System.out.println("itar " + s);
        }
    }
}
