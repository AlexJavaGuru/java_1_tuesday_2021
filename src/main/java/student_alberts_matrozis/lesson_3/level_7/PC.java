package student_alberts_matrozis.lesson_3.level_7;

import java.util.Timer;

// Task 29 part 1
class PC {
    String OS;
    int RAM;
    String CPU;
    String GPU;
    boolean isOn = false;

    public PC(String OS,
              String CPU,
              String GPU,
              int RAM) {
        this.OS  = OS;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public void turnOnPC() {
        if (!isOn) {
            System.out.println("Starting all PC components!");
            System.out.println("PC is on!");
            isOn = true;
        } else {
            System.out.println("PC is already on!");
        }
    }

    public void checkMaxLaodInGame() {
        if (isOn) {
            System.out.println("CPU - " + (int)(Math.random() * 100) + "%");
            System.out.println("GPU - " + (int)(Math.random() * 100) + "%");
            System.out.println("RAM - " + (int)(Math.random() * 100) + "%");
        } else {
            System.out.println("PC is off!");
        }
    }

    public void turnOffPC() {
        if (isOn) {
            System.out.println("Shutting off all PC components!");
            System.out.println("PC is off!");
            isOn = false;
        } else {
            System.out.println("PC is already off!");
        }
    }

}
