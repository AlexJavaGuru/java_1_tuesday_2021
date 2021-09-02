package student_josifs_makarenko.lesson_4.level5;

import java.lang.invoke.StringConcatException;

public class LightColorDetector {

    public String lightColor (int number) {

        if (number >= 380 && number <= 449) {
            return "Violet";
        } else if (number >= 450 && number <= 494) {
            return "Blue";
        } else if (number >= 495 && number <= 569) {
            return "Green";
        } else if (number >= 570 && number <= 589) {
            return "Yellow";
        } else if (number >= 590 && number <= 619) {
            return "Orange";
        } else if (number >= 620 && number <= 750) {
            return "Red";
        }
        return "Invisible Light";
    }
}
