package student_alberts_matrozis.lesson_2.level_8;

import teacher.annotations.CodeReview;

import java.lang.Integer;

@CodeReview(approved = true)
public class FizzBuzz {
        public String fizzBuzz(Integer i) {
            String result = "";
            if (i % 3 == 0)
                result += "Fizz";
            if (i % 5 == 0)
                result += "Buzz";
            if (result.equals(""))
                result += i.toString();
            return result;
    }
}
