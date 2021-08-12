package student_oleg_kozlov.lesson_3.level_7;

// Task_29
class PassengerPlaneDemo {

    public static void main(String[] args) {

        PassengerPlane sukhoiSJ = new PassengerPlane("Sukhoi Superjet 100", (short) 108);
        PassengerPlane kukuruznik = new PassengerPlane("An-2", (short) 12);

        // *** Sukhoi Superjet 100

        sukhoiSJ.getPlaneInfo();
        sukhoiSJ.setPreparedForFlight(true);
        sukhoiSJ.boarding((short)108);
        sukhoiSJ.getPlaneStatus();
        sukhoiSJ.takeOff();
        sukhoiSJ.getPlaneStatus();
        sukhoiSJ.landing();
        sukhoiSJ.getPlaneStatus();

        // *** An-2

        kukuruznik.getPlaneInfo();
        kukuruznik.boarding((short)100);
        kukuruznik.boarding((short)12);
        kukuruznik.takeOff();
        kukuruznik.setPreparedForFlight(true);
        kukuruznik.takeOff();
        kukuruznik.getPlaneStatus();
        kukuruznik.boarding((short)1);
        kukuruznik.landing();
        kukuruznik.getPlaneStatus();
    }
}
