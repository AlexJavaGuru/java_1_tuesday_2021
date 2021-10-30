package student_oleg_kozlov.lesson_13.level_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Task_26, Task_29, Task_30, Task_31, Task_32
class StringCalculator {
    int add(String numbers) {
        if (numbers.isBlank()) {
            return 0;
        }
        checkInput(numbers);
        int[] intArr = getSplitStringAsIntegerArray(numbers);
        return getSum(intArr);
    }

    private void checkInput(String input) {
        if (input.endsWith("\n")) {
            throw new IllegalArgumentException("Provided string can't be ended by New Line symbol!");
        }
    }

    private String getDelimitersPart(String input) {
        if (input.startsWith("//[")) {
            int indexToStop = input.indexOf("]\n");
            return input.substring(3, indexToStop);
        }
        return "";
    }

    private String getNumbersPart(String input) {
        if (input.startsWith("//[")) {
            int indexToStart = input.indexOf("]\n");
            return input.substring(indexToStart + 2);
        } else {
            return input;
        }
    }

    private List<String> getDelimiters(String input) {
        List<String> delimiters = new ArrayList<>();
        delimiters.add("\n");
        String delimitersPart = getDelimitersPart(input);
        if (!delimitersPart.isBlank()) {
            String[] split = new String[0];
            try {
                split = delimitersPart.replaceAll("\\[", "").split("]");
            } catch (Exception e) {
                e.printStackTrace();
            }
            Collections.addAll(delimiters, split);
        }
        return delimiters;
    }

    private String getStringWithCommaDelimiters(String input) {
        String result = getNumbersPart(input);
        List<String> delimiters = getDelimiters(input);
        for (String delimiter : delimiters) {
            result = result.replaceAll(delimiter, ",");
        }
        return result;
    }

    private int[] getSplitStringAsIntegerArray(String input) {
        String commaSeparated = getStringWithCommaDelimiters(input);
        String[] strArray = new String[0];
        try {
            strArray = commaSeparated.split(",");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] result = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            try {
                result[i] = Integer.parseInt(strArray[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private int getSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }
}
