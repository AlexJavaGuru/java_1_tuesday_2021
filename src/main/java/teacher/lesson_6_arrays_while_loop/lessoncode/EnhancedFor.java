package teacher.lesson_6_arrays_while_loop.lessoncode;

public class EnhancedFor {

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "My", "Name", "Is", "Alex"};

        for (String word : stringArray) {
            if (word.length() < 3) {
                continue;
            }
            System.out.println(word);
        }

        EnhancedFor enhancedFor = new EnhancedFor();
        enhancedFor.test();

    }

    public void test() {

    }
}
