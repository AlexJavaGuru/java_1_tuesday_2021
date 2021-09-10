package student_ruslan_pankratov.lesson_6.level_0;

//Task_0
public class Ruslan {

    private boolean isInspired;

    public static void main(String[] args) {
        Ruslan ruslan = new Ruslan();
        ruslan.readTask_0();

        boolean expectedResult = true;

        if (ruslan.isInspired == expectedResult) {
            System.out.println("Вдохновился.");
        } else {
            System.out.println("Не вдохновился");
        }
    }

    public void readTask_0() {
        isInspired = true;
    }


}
