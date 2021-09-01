package teacher.lesson_6_arrays_while_loop.lessoncode.staticexample;

import java.util.Arrays;

public class MessageSystem {


    public static void main(String[] args) {

        Message messageOne = new Message("Hello");
        Message messageTwo = new Message("from");
        Message messageThree = new Message("JavaGuru");

        System.out.println(messageOne.getText());
        System.out.println(messageTwo.getText());
        System.out.println(messageThree.getText());

        Message.increaseValue();
        Message.increaseValue();
        Message.increaseValue();
        System.out.println(Message.getInstancesCounter());



    }
}
