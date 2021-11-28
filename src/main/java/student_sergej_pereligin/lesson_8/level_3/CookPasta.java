package student_sergej_pereligin.lesson_8.level_3;


public abstract class CookPasta {

    protected String pastaType;
    protected String sauceType;
    protected int timeToCook;

    public CookPasta(String pastaType, String souceType, int timeToCook) {
        this.pastaType = pastaType;
        this.sauceType = sauceType;
        this.timeToCook = timeToCook;
    }


    public abstract void startCooking();

    public abstract boolean isReady();

    public String getPastaType() {
        return pastaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public int getTimeToCook() {
        return timeToCook;
    }
}
