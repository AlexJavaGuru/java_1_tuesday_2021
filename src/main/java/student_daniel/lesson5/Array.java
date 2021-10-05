package student_daniel.lesson5;

import java.util.Arrays;

class Array {
    //type[] name; <- odnomernij massiv
    //type[] name = new type[size];
    //type[] name = {var1,..,varN};

    //type[][] name; <- dvuhmernij massiv

    public static void main(String[] args) {
        int[] leapYears = new int[3];
        leapYears[0] = 2020;
        leapYears[1] = 2016;
        leapYears[2] = 2012;
        System.out.println(Arrays.toString(leapYears));
        System.out.println(leapYears[1]);

        int[] yearsToPrint = {2000, 2016, 2012};
        System.out.println(Arrays.toString(yearsToPrint));

        boolean[] booleanArray = new boolean[3];
        booleanArray[0] = true;
        //false = default value
        booleanArray[1] = false;
        booleanArray[2] = true;
        System.out.println(Arrays.toString(booleanArray));

        String[] textArray = {"Hello ","my ", "name ", "is ", "Daniel "};
        System.out.println(Arrays.toString(textArray));
        System.out.println((textArray[4] + textArray[3] + textArray[2] + textArray[1] + textArray[0]));

        int[] intArray = {1, 2, 3, 4, 5};
        intArray[0] = intArray[0] * 10;
        intArray[1] = intArray[1] * 10;
        intArray[2] = intArray[2] * 10;
        intArray[3] = intArray[3] * 10;
        intArray[4] = intArray[4] * 10;
        System.out.println(Arrays.toString(intArray));
    }
}
