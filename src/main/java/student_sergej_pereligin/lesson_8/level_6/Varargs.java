package student_sergej_pereligin.lesson_8.level_6;


public class Varargs {
    public static void main(String[] args) {
        newVararg(1, 2, 3, 4, 5, 6, 7);
        newVararg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumNumber(1, 2, 3, 4, 5);

    }

    public static int newVararg(int...purple){
        int sumTotal = 0;
        for (int i = 0; i < purple.length; i++) {
            sumTotal = sumTotal + purple[i];
        }
        System.out.println(sumTotal);
        return sumTotal;
    }


//Varargs is a short name for variable arguments.
//In Java, an argument of a method can accept arbitrary number of values.
//This argument that can accept variable number of values is called varargs.


    public static int sumNumber (int...listOfNumbers){
        int sum = 0;
        for (int x: listOfNumbers) {
            sum += x;
        }
        System.out.println("Argument length: " + listOfNumbers.length + ", Sum value: " + sum);
        return sum;
    }

}

//Basically, varagrs allow the user to pass in as many values as they need.
//Otherwise, a program would need to strictly define number of values, which overloads the code.