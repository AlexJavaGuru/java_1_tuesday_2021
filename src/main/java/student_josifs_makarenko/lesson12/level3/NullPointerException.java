package student_josifs_makarenko.lesson12.level3;

public class NullPointerException {
    public static void main(String[] args) {
        String text = null;

        try {
            if (text.equals("F"))
                System.out.println("pay respect");
        } catch (java.lang.NullPointerException e) {
            System.out.println("WE CATCH THAT");
        }
    }
}
