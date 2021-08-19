package student_daniel.lesson3.level7;

class Refrigerator {
    //Task 29-1
    String model;
    double consumption;
    int temperature;

    //Constructor
    Refrigerator(String model, double consumption, int temperature){
        this.model = model;
        this.consumption = consumption;
        this.temperature = temperature;
    }

    //Methods
    public int getTemperature() {
        return temperature;
    }

    void getCold() {
        System.out.println("Samsung " + model);
        System.out.println("Annual consumption " + consumption + " kWt");
        System.out.println("Current temperature is " + temperature + " celsius");
        System.out.println("Get temperature: " + getTemperature() + " celsius");
    }
}
