package student_ruslan_pankratov.lesson_6.level_4;

//Task_21
class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = new int[10][10];
        twoDimensionalArray.method(arr);

    }


    void method(int[][] arr) {
        random(arr);
        System.out.println("Сумма всех чисел = " + count(arr));

    }

    void random(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    int count(int[][] arr) {
        int countNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                countNumber = countNumber + arr[i][j];
            }
        }

        return countNumber;
    }


}
