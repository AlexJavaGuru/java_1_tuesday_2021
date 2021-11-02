package teacher.lesson_14_streamapi.lessoncode;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        FruitStreamApi streamApi = new FruitStreamApi();

        System.out.println(streamApi.findAllFruitUniqNames());

        Map<Integer, List<Fruit>> integerListMap = streamApi.groupByWeight();

        System.out.println(streamApi.test());

        streamApi.findRedApplesWithWeightBiggerThen100();
        int a = 1;
    }
}
