package student_sergej_pereligin.lesson_8.level_2.Computer_players;


public class ComputerPlayer extends Player {

    private int age;
    public ComputerPlayer(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
