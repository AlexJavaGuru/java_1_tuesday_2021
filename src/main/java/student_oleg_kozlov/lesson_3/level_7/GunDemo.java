package student_oleg_kozlov.lesson_3.level_7;

// Task_29
class GunDemo {

    public static void main(String[] args) {
        Gun revolver = new Gun("NRP9 Police Revolver", 0.38f, (byte) 7);
        Gun pistol = new Gun("Walther CCP", 9f, (byte) 8);

        // *** Revolver

        revolver.getGunInfo();

        if (revolver.checkGunMagazine() == 0)
            revolver.load();

        revolver.checkGunMagazine();

        if (revolver.isLocked())
            revolver.setLocked(false);

        revolver.shoot();
        revolver.setLocked(true);
        System.out.println("Gun is locked: " + revolver.isLocked());
        revolver.checkGunMagazine();

        // *** Pistol

        pistol.getGunInfo();
        pistol.shoot();
        pistol.setLocked(false);
        pistol.shoot();
        pistol.load();
        pistol.shoot();
        pistol.checkGunMagazine();
        pistol.setLocked(true);
        System.out.println("Gun is locked: " + pistol.isLocked());
    }

}
