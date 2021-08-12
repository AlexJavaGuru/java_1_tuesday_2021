package student_ruslan_pankratov.leson_3.level_3;

import teacher.annotations.CodeReview;

//Task 11,12,13
@CodeReview(approved = true)
public class RobotOne {
        String name;
        RobotOne(String name) {
        this.name = name;
        }

        public void sayHello() {
            System.out.println("Hello");
        }

        public void sayYourName() {
            System.out.println("My name is " + name);
        }


}
