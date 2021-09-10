package student_oleg_kozlov.lesson_4.level_7;

// Task_23
class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        if (year % 4 != 0) {
            return false;
        }
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        if (year % 100 != 0) {
            return true;
        }
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        if (year % 400 == 0) {
            return true;
        }
        // Иначе год обычный.
        return false;
    }
}
