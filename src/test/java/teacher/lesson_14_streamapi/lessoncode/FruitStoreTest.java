package teacher.lesson_14_streamapi.lessoncode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStoreTest {

    FruitStore store = new FruitStore();

    @Test
    public void findAllApplesTest() {
        List<Fruit> result = store.getAllApples();
        assertEquals(2, result.size());
    }

    @Test
    public void findAllPearsTest() {
        List<Fruit> result = store.getAllPears();
        assertEquals(2, result.size());
    }

    @Test
    public void findAllTomatosTest() {
        List<Fruit> result = store.getAllTomatos();
        assertEquals(1, result.size());
    }
}