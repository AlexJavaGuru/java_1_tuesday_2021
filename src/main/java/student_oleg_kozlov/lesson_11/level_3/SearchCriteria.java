package student_oleg_kozlov.lesson_11.level_3;

// Task_15, Task_39, Task_40
public interface SearchCriteria {
    boolean match(Book book);

    Paging getPaging();

    SortingType getSortingType();
}
