package student_josifs_makarenko.lesson_3.level7;

public class Food {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   private String name;

    public boolean isTaste() {
        return taste;
    }

    public void setTaste(boolean taste) {
        this.taste = taste;
    }

    boolean taste;

    void foodName(){
        System.out.println("This food is " + getName());
    }
    void showFoodTaste(){
        if (isTaste() == false) {
            System.out.println("Your " + getName() + " is  disgusting");
        } else if (isTaste() == true){
            System.out.println("Your " + getName() + " is tasty");
        }
    }
}
