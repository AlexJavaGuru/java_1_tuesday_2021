package student_josifs_makarenko.lesson_9.level7;

public class AdultSorter implements Sorter{
    @Override
    public String sortHumans(Person person) {
        if (person.getAge() <= 18 && person.getAge() < 65 && person.getGender().equals("Male")) {
            return person.getName() + " is an adult";
        } else if (person.getAge() <= 18 && person.getAge() < 60 && person.getGender().equals("Female")) {
            return person.getName() + " is an adult";
        }
        return "This person is not an adult";
    }
}
