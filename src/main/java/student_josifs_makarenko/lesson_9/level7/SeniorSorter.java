package student_josifs_makarenko.lesson_9.level7;

public class SeniorSorter implements Sorter {
    @Override
    public String sortHumans(Person person) {
        if (person.getAge() >= 65 && person.getGender().equals("Male")) {
            return person.getName() + " is a senior";
        } else if (person.getAge() >= 60 && person.getGender().equals("Female")) {
            return person.getName() + "is a senior";
        }
        return "Person is not a senior";
    }
}
