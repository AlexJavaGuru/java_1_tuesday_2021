package teacher.lesson_7_encapsulation.lessoncode;

import teacher.lesson_7_encapsulation.lessoncode.BasicCounter;

public class BasiCounterDemo {

    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getCount());
        counter.setCount(-100);
        System.out.println(counter.getCount());

    }

    public void check(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " success!!!");
        }
    }


    public boolean checkArrays(int[] expectedArray, int[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            return false;
        }

        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                return false;
            }
        }
        return true;
    }
}
