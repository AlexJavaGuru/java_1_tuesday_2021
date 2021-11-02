package teacher.lesson_14_streamapi.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStore() {
        fruits.add(new Fruit("apple", "red", 100));
        fruits.add(new Fruit("apple", "green", 200));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 100));
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    // Требование 1: отобрать все яблоки
    public List<Fruit> getAllApples() {
        return findByTitle("apple");
    }


    // Требование 2: отобрать все груши
    public List<Fruit> getAllPears() {
        return findByTitle("pear");
    }


    // Требование 3: отобрать все помидоры
    public List<Fruit> getAllTomatos() {
        return findByTitle("tomato");
    }

    public List<Fruit> findByTitle(String title) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals(title)) {
                result.add(fruit);
            }
        }
        return result;
    }

    // Требование 4: красные фрукты
    public List<Fruit> findAllFruitsByColor(String fruitColor) {
        return findByColor(fruitColor);
    }


    public List<Fruit> findByColor(String color) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color)) {
                result.add(fruit);
            }
        }
        return result;
    }


    // Требование 5: красные помидоры
    public List<Fruit> findFruitsByTitleAndColor(String fruitTitle,
                                                 String fruitColor) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals(fruitTitle) &&
                    fruit.getColor().equals(fruitColor)) {
                result.add(fruit);
            }
        }
        return result;
    }



    // Требование 6: красные помидоры > 100
    public List<Fruit> findFruitsByTitleAndColorAndWeight(String fruitTitle,
                                                          String fruitColor,
                                                          int weight) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals(fruitTitle) &&
                    fruit.getColor().equals(fruitColor) &&
                    fruit.getWeight() == weight) {
                result.add(fruit);
            }
        }
        return result;
    }

    public List<Fruit> findByCriteria(FilterCriteria filterCriteria) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (filterCriteria.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

}
