package student_oleg_kozlov.lesson_3.level_7;

// Task_29
class PassengerPlane {

    private String model;
    private short seats;
    boolean isPreparedForFlight;
    boolean isInTheAir;

    // *** Getters and Setters

    public void setPreparedForFlight(boolean preparedForFlight) {
        isPreparedForFlight = preparedForFlight;
    }

    //  Constructor
    public PassengerPlane(String model, short seats) {
        this.model = model;
        this.seats = seats;
        this.isPreparedForFlight = false;
        this.isInTheAir = false;
    }

    // *** Methods

    public void getPlaneInfo() {
        System.out.println("\n---------------------");
        System.out.println("Model: " + model + "; " + "Seats: " + seats + "; " + "Ready for flight: "
                + isPreparedForFlight + "; " + "In the air now: " + isInTheAir);
        System.out.println("---------------------");
    }

    public void getPlaneStatus() {
        System.out.println("Status => Ready for flight: " + isPreparedForFlight + "; "
                + "In the air now: " + isInTheAir);
    }

    public void boarding(short passengers) {
        if (isInTheAir) {
            System.out.println("Boarding is canceled! Plane is in the air now!");
            return;
        }
        if (passengers > seats) {
            System.out.println("Boarding is canceled! Too many passengers for this plane!");
            return;
        }
        System.out.println("Boarding has been successfully completed.");
    }

    public void takeOff() {
        if (isInTheAir) {
            System.out.println("Taking off is canceled! Plane is already in the air!");
            return;
        }
        if (!isPreparedForFlight) {
            System.out.println("Taking off is canceled! Plane is not prepared for the flight!");
            return;
        }
        System.out.println("The plane has successfully taken off.");
        isInTheAir = true;
    }

    public void landing() {
        if (!isInTheAir) {
            System.out.println("Landing is canceled! Plane is not in the air now!");
            return;
        }
        System.out.println("Landing has been successfully completed.");
        isInTheAir = false;
        isPreparedForFlight = false;
    }
}
