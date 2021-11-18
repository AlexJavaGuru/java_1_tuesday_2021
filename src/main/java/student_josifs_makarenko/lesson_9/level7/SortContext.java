package student_josifs_makarenko.lesson_9.level7;

public class SortContext {
    private final Sorter sorter;

    public SortContext (Sorter sorter) {
        this.sorter = sorter;
    }

    public String executeContext (Person person) {
        return sorter.sortHumans(person);
    }
}
