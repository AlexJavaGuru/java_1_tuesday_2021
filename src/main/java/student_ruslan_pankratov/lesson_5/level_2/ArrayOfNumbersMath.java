package student_ruslan_pankratov.lesson_5.level_2;

//Task_15
class ArrayOfNumbersMath {
    public static void main(String[] args) {
        int numberOne = (int) (Math.random() * 100 + 10);
        int numberTwo = (int) (Math.random() * 100 + 10);
        int numberThree = (int) (Math.random() * 110);

        int[] number = {numberOne, numberTwo, numberThree};
        for (int i : number) {
            System.out.println(i);
        }
        number[0] = number[0] + 2;
        number[1] = number[1] + 2;
        number[2] = number[2] + 2;
        for (int b : number) {
            System.out.println(b);
        }
    }
}
