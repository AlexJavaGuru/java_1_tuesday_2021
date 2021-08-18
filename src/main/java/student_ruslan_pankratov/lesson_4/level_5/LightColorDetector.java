package student_ruslan_pankratov.lesson_4.level_5;

//Task_16
class LightColorDetector {


    public String detect(int wavelength) {
        String collor;
        if ((wavelength >= 380) && (wavelength <= 449)) {
            collor = "Violet";
            return collor;
        } else if ((wavelength >= 450) && (wavelength <= 494)) {
            collor = "Blue";
            return collor;
        } else if ((wavelength >= 495) && (wavelength <= 569)) {
            collor = "Green";
            return collor;
        } else if ((wavelength >= 570) && (wavelength <= 589)) {
            collor = "Yellow";
            return collor;
        } else if ((wavelength >= 590) && (wavelength <= 619)) {
            collor = "Orange";
            return collor;
        } else if ((wavelength >= 620) && (wavelength <= 750)) {
            collor = "Red";
            return collor;
        } else {
            collor = "Invisible Light";
            return collor;
        }


    }
}
