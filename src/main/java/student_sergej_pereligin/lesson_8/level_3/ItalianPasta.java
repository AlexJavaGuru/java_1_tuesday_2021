package student_sergej_pereligin.lesson_8.level_3;


public class ItalianPasta extends CookPasta {
    private boolean isWaterBoiling;


    public ItalianPasta(String pastaType, String sauceType, int timeToCook, boolean isWaterBoiling) {
        super(pastaType, sauceType, timeToCook);
        this.isWaterBoiling = isWaterBoiling;
    }

    @Override
    public void startCooking() {
        if (isWaterBoiling) {
            System.out.println("Water is hot enough, start cooking!");
        }
    }

    @Override
    public boolean isReady() {
        if (true) {
            System.out.println("Pasta is ready, don't forget to add sauce!");
        } else {
            System.out.println("Try cooking a bit more!");
        }
        return true;
    }

}
