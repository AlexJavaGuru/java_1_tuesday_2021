package student_josifs_makarenko.lesson_3.level7;



public class ComputerGame {

    String name;
    String dateOfRelease;
    boolean feels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(String dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }


    public boolean isFeels() {
        return feels;
    }

    public void setFeels(boolean feels) {
        this.feels = feels;
    }


    void sayСрaracteristic(){
        System.out.println("Game released in " + getDateOfRelease());
    }
    void play(){
        if(isFeels() == false){
            System.out.println("Game is not cool!");
        } else if(isFeels() == true){
            System.out.println("Game is cool");
        }

    }
}
