package student_josifs_makarenko.lesson_9.level3;

public class FunctionalInterfaceRealisation implements GamerCheck {
//task 6
    @Override
    public boolean isPlayer(String key) {
        if (key.equals("Dotaa 2")) {
            System.out.println("Gamer is found");
            return true;
        }
        return false;
    }
}
