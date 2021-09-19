package student_josifs_makarenko.lesson_7.level7;
//task_15
import java.util.Random;

public class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalCode;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    UserEntity(String name, String surname, int personalCode) {
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;

        Random random = new Random();
        int max = 9999;
        int min = 1000;
        int newId = random.nextInt(max - min + 1) + min;
        setId(newId);
    }

    public String toString() {
        return "\n" + " | " + "Name: " + name + " | Surname: " + surname + " | Personal Code: " + personalCode + " | Id: " + id + " |";
    }


}
