package teacher.lesson_14_streamapi.lessoncode;

import student_einars_marhilevics.lesson_8.level_7.Book;
import teacher.lesson_14_streamapi.lessoncode.searchcriteria.AppleFilterCriteria;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FruitStreamApi {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStreamApi() {
        fruits.add(new Fruit("apple", "red", 50));
        fruits.add(new Fruit("apple", "green", 100));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 150));
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    public List<Fruit> findAllApples() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .collect(Collectors.toList());
    }

    public List<Fruit> findAllApplesV2() {
        return fruits.stream()
                .filter(new Predicate<Fruit>() {
                    @Override
                    public boolean test(Fruit x) {
                        return "apple".equals(x.getTitle());
                    }
                })
                .collect(Collectors.toList());
    }


    public List<Fruit> findAllApplesV3() {
        Predicate<Fruit> predicate = new Predicate<>() {
            @Override
            public boolean test(Fruit x) {
                return "apple".equals(x.getTitle());
            }
        };

        return fruits.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public List<Fruit> findAllApplesV4() {
        AppleFilterCriteria filterCriteria = new AppleFilterCriteria();

        return fruits.stream()
                .filter(filterCriteria)
                .collect(Collectors.toList());
    }

    public List<Fruit> findRedApplesWithWeightBiggerThen100() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .filter(fruit -> "red".equals(fruit.getColor()))
                .filter(fruit -> fruit.getWeight() > 100)
                .peek(item -> System.out.println(item.getTitle()))
                .collect(Collectors.toList());
    }


    public Set<Book> findAllFruitUniqNames() {
        Function<Fruit, String> getTitle = new Function<Fruit, String>() {
            @Override
            public String apply(Fruit fruit) {
                return fruit.getTitle();
            }
        };


        return fruits.stream() //Stream<Fruit>
                .map(fruit -> new Book(fruit.getTitle(), fruit.getColor(), false))  // Stream<String>
                .collect(Collectors.toSet());
    }






    public List<Fruit> findAllFruitUniqueNames() {
        return fruits.stream()
                .distinct()
                .collect(Collectors.toList());
    }




    public Fruit findAnyApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findAny()
                .orElseThrow(() -> new IllegalStateException());
    }

    public Optional<Fruit> findFirstApple() {
        return fruits.stream()
                .filter(fruit -> "apple".equals(fruit.getTitle()))
                .findFirst();
    }


    public Map<Integer, List<Fruit>> groupByWeight() {
        return fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.getWeight()));
    }




    public Set<String> test() {
        Map<Integer, List<Fruit>> result = groupByWeight();
        Set<Map.Entry<Integer, List<Fruit>>> entries = result.entrySet();
        return entries.stream()
				.parallel()
                .map(entry -> entry.getValue())
//				.map(entry -> entry.getValue())
                .flatMap(x -> x.stream())
                .map(Fruit::getColor)
//				.map(fruit -> fruit.getColor())
                .collect(Collectors.toSet());
    }
}
