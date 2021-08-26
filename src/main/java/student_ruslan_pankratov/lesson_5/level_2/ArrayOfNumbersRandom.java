package student_ruslan_pankratov.lesson_5.level_2;

//Task_12
class ArrayOfNumbersRandom {
    public static void main(String[] args) {

        int one = (int) (Math.random() * 7 + 10);
        int two = (int) (Math.random() * 7 + 10);
        int three = (int) (Math.random() * 7 + 10);

        int[] number = {one, two, three};
        for (int i : number) {
            System.out.println(i);
        }
    }
}
