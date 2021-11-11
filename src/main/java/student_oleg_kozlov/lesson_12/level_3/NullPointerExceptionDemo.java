package student_oleg_kozlov.lesson_12.level_3;

/*
NullPointerException происходит когда программа пытается
использовать ссылку на объект, которая имеет значение null
 */

// Task_18
class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text = null;
        try
        {
            if (text.equals("aaa"))
                System.out.print("The same");
            else
                System.out.print("Not the Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
    }
}
