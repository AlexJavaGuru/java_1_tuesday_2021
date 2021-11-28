package student_sergej_pereligin.lesson_9.level_2;


public class DayOfTheWeekArray implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] manyDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

//        if(number == 1){
//            System.out.println(manyDays[0]);
//        }
//        else if(number == 2){
//            System.out.println(manyDays[1]);
//        }
//        else if(number == 3){
//            System.out.println(manyDays[2]);
//        }
//        else if(number == 4){
//            System.out.println(manyDays[3]);
//        }
//        else if(number == 5){
//            System.out.println(manyDays[4]);
//        }
//        else if(number == 6){
//            System.out.println(manyDays[5]);
//        }
//        else if(number == 7){
//            System.out.println(manyDays[6]);
//        }
//
//        return Arrays.toString(manyDays)
            if (number >= 1 && number <= 7) {
                return manyDays[number - 1];
            }
            return "Please input a valid number between 1 and 7";
    }

}
