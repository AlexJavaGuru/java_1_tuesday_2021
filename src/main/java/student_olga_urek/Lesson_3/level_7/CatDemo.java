package student_olga_urek.Lesson_3.level_7;
//Task 29

class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat("Murzik", 2.5, true, 2);
        myCat.feedCat();
        myCat.hungerStatus();
        myCat.weightStatus();

        myCat.playWithCat();
        myCat.hungerStatus();
        myCat.weightStatus();

        myCat.catchMice();
        myCat.mouseRecord();

    }
}
