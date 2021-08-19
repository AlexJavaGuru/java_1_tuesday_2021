package student_alberts_matrozis.lesson_3.level_7;

// Task 29 part 2

class SmartWatch {
    String model;
    String OS;
    int RAM;
    public SmartWatch(String model,
                      String OS,
                      int RAM) {
        this.model = model;
        this.OS = OS;
        this.RAM = RAM;
    }

    public void aboutDevice() {
        System.out.println("Model - " + model);
        System.out.println("OS - " + OS);
        System.out.println("RAM - " + RAM);
    }

    public void connectToDevice() {
        System.out.println("Turning on bluetooth!");
        System.out.println("Searching available devices!");
        System.out.println("Finded and successfully connected to available device!");
    }
}
