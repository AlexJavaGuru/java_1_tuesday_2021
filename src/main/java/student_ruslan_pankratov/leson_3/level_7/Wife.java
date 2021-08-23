package student_ruslan_pankratov.leson_3.level_7;

//Task_29
class Wife {
    private int angryPoints = 50;
    private int hungerPoints = 50;
    private int kindnessPoints = 50;
    private int fatPoints = 50;

    void showInitialState() {
        System.out.println(angryPoints);
        System.out.println(hungerPoints);
        System.out.println(kindnessPoints);
        System.out.println(fatPoints);

    }

    void oneDayDiet() {
        System.out.println("Началась диета....");
        angryPoints = angryPoints + 40;
        hungerPoints = hungerPoints + 30;
        kindnessPoints = kindnessPoints - 20;
        fatPoints = fatPoints - 10;
        System.out.println("Очки злобы поднебесной: (+40) " + angryPoints);
        System.out.println("Очки голода: (+30) " + hungerPoints);
        System.out.println("Очки доброты: (-20) " + kindnessPoints);
        System.out.println("Очки жира: (-10) " + fatPoints);
        System.out.println("");
    }

    void eatCake() {
        System.out.println("Съела в тайне ночью торт");
        angryPoints = angryPoints - 20;
        hungerPoints = hungerPoints - 20;
        kindnessPoints = kindnessPoints + 50;
        fatPoints = fatPoints + 30;
        System.out.println("Очки злобы поднебесной: (-20) " + angryPoints);
        System.out.println("Очки голода: (-20) " + hungerPoints);
        System.out.println("Очки доброты: (+50) " + kindnessPoints);
        System.out.println("Очки жира: (+30) " + fatPoints);
        System.out.println("");
    }


    void embrace() {
        System.out.println("Объятия никогда не бывают лишними");
        angryPoints = angryPoints - 20;
        kindnessPoints = kindnessPoints + 20;
        System.out.println("Очки злобы поднебесной: (-20) " + angryPoints);
        System.out.println("Очки голода: " + hungerPoints);
        System.out.println("Очки доброты: (+20) " + kindnessPoints);
        System.out.println("Очки жира: " + fatPoints);
        System.out.println("");
    }

    void quarrel() {
        System.out.println("Не стоило мне спорить.... ");
        angryPoints = angryPoints + 10;
        kindnessPoints = kindnessPoints - 10;
        System.out.println("Очки злобы поднебесной: (+10) " + angryPoints);
        System.out.println("Очки голода: " + hungerPoints);
        System.out.println("Очки доброты: (-10) " + kindnessPoints);
        System.out.println("Очки жира: " + fatPoints);
        System.out.println("");

    }

}