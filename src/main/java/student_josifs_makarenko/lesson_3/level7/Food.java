package student_josifs_makarenko.lesson_3.level7;

public class Food {

    private String name;
    boolean taste;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isTaste() {
        return taste;
    }

    public void setTaste(boolean taste) {
        this.taste = taste;
    }


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
