package student_josifs_makarenko.lesson_9.level7;

public class ChildSorter implements Sorter {

    @Override
    public String sortHumans(Person person) {
        if (person.getAge() < 18) {
            return person.getName() + " is a child";
        }
        return "This person is not a child";
    }
}
