package student_julija_kuzmicova.lesson_7.level_5;

//Task_9
class PowerCalculator {

    double numberToPower(double number, int power) {
        double result = 1;
        int powerModule = power;
        if(power < 0) {
            powerModule = power * (-1);
        }
        for(int i = 1; i <= powerModule; i++) {
            result = number * result;
        }
        if(power < 0) {
            result = 1 / result;
        }
        if(power == 0) {
            result = 1;
        }
        return result;
    }
}
