package student_julija_kuzmicova.lesson_9.level_3;

//Task_6
class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        FuncInterface functionalInterface = x -> x > 0;
        System.out.println(functionalInterface.test(5));
    }


}
