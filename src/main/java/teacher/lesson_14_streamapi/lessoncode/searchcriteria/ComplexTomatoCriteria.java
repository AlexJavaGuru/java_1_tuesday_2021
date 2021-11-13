package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;

public class ComplexTomatoCriteria implements FilterCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("tomato") &&
                fruit.getColor().equals("red") &&
                fruit.getWeight() > 100;
    }
}
