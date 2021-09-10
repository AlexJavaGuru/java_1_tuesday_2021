package student_daniel.lesson3.level7;

class Wife {
    //Task 29-2
    String name;
    boolean inLove;

    //Constructor
    Wife(String name, boolean inLove) {
        this.name = name;
        this.inLove = inLove;
    }

    //Methods
    void beforeWeMet() {
        System.out.println("Before I met " + name + ", love was " + inLove);
    }

    public boolean getLove() {
        return inLove;
    }

    void getPrint() {
        System.out.println("After " + name + " met me, love become " + getLove());
    }


}
