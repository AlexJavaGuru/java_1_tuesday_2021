package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;

import java.util.function.Predicate;

public class AppleFilterCriteria implements Predicate<Fruit> {

    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("apple");
    }
}
