package student_sergej_pereligin.lesson_7.level_5;


public class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
               powerCalculator.numToPow(5,5);
    }


    public int numToPow(int base, int pow){
        int res = 1;
        while (pow > 0){
            res = res * base;
            pow--;
        }
        System.out.println(res);
        return res;
    }
}


