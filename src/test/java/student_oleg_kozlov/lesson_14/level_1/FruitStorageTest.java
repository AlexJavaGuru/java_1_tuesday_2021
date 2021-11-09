package student_oleg_kozlov.lesson_14.level_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

// Task_1, Task_4, Task_5, Task_10, Task_11, Task_14, Task_17
public class FruitStorageTest {
    FruitStorage storage = new FruitStorage();

    @Test
    public void shouldFindAllGreenApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertArrayEquals(expected.toArray(), storage.findApplesByColor(storage.getAllApples(), "green").toArray());
    }

    @Test
    public void shouldFindAllRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertArrayEquals(expected.toArray(), storage.findApplesByColor(storage.getAllApples(), "red").toArray());
    }

    @Test
    public void shouldFindAllYellowApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("yellow", 50));
        expected.add(new Apple("yellow", 170));
        assertArrayEquals(expected.toArray(), storage.findApplesByColor(storage.getAllApples(), "yellow").toArray());
    }

    @Test
    public void shouldFindAllApplesWithWeightMoreThan150() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertArrayEquals(expected.toArray(), storage.findApplesByWeight(storage.getAllApples(), 150).toArray());
    }

    @Test
    public void shouldFindGreenApplesByPredicate() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertArrayEquals(expected.toArray(), storage.findApples(storage.getAllApples(), new AppleGreenColorPredicate()).toArray());
    }

    @Test
    public void shouldFindRedApplesByPredicate() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertArrayEquals(expected.toArray(), storage.findApples(storage.getAllApples(), new AppleRedColorPredicate()).toArray());
    }

    @Test
    public void shouldFindHeavyWeightApplesByPredicate() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertArrayEquals(expected.toArray(), storage.findApples(storage.getAllApples(), new AppleHeavyWeightPredicate()).toArray());
    }

    @Test
    public void shouldFindLightWeightApplesByPredicate() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertArrayEquals(expected.toArray(), storage.findApples(storage.getAllApples(), new AppleLightWeightPredicate()).toArray());
    }

    @Test
    public void shouldFindGreenAndHeavyWeightApplesByPredicate() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        assertArrayEquals(expected.toArray(), storage.findApples(storage.getAllApples(), new AppleGreenAndHeavyWeightPredicate()).toArray());
    }

    @Test
    public void shouldFindGreenApplesByAnonymous() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindRedApplesByAnonymous() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindHeavyWeightApplesByAnonymous() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindLightWeightApplesByAnonymous() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() <= 150;
            }
        });
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindGreenApplesByLambda() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        List<Apple> actual = storage.findApples(storage.getAllApples(), (apple) -> "green".equals(apple.getColor()));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindRedApplesByLambda() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        List<Apple> actual = storage.findApples(storage.getAllApples(), (apple) -> "red".equals(apple.getColor()));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindHeavyWeightApplesByLambda() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        List<Apple> actual = storage.findApples(storage.getAllApples(), (apple) -> apple.getWeight() > 150);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindLightWeightApplesByLambda() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        List<Apple> actual = storage.findApples(storage.getAllApples(), (apple) -> apple.getWeight() <= 150);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void shouldFindGreenAndHeavyWeightApplesByLambda() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        List<Apple> actual = storage.findApples(storage.getAllApples(), (apple) -> "green".equals(apple.getColor())
                && apple.getWeight() > 150);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}