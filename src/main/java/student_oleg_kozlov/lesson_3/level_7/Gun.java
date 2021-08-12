package student_oleg_kozlov.lesson_3.level_7;

// Task_29
class Gun {

    private String model;
    private float caliber;
    private byte bulletsMax;
    private byte bulletsActual;
    private boolean isLocked;

    // *** Getters and Setters

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    //  Constructor
    public Gun(String model, float caliber, byte bulletsMax) {
        this.model = model;
        this.caliber = caliber;
        this.bulletsMax = bulletsMax;
        this.bulletsActual = 0;
        this.isLocked = true;
    }

    // *** Methods

    public void getGunInfo() {
        System.out.println("\n---------------------");
        System.out.println("Model: " + model + "; " + "Caliber: " + caliber + "; " + "Max bullets: " + bulletsMax +
                "; " + "Bullets in the gun: " + bulletsActual + "; " + "Is locked now: " + isLocked );
        System.out.println("---------------------");
    }

    public byte checkGunMagazine() {
        System.out.println("Currently the gun contains " + bulletsActual + " bullets");
        return bulletsActual;
    }

    public void load() {
        if (bulletsMax != bulletsActual) {
            System.out.println("Loading process...");
        }
        while(bulletsMax > bulletsActual) {
            bulletsActual++;
        }
    }

    public void shoot() {
        if (isLocked) {
            System.out.println("Gun is locked! Please unlock trigger!");
            return;
        }

        if (bulletsActual == 0) {
            System.out.println("Gun is empty! Please load it!");
            return;
        }

        System.out.println("Bah!!!");
        bulletsActual--;
    }
}
