package student_alberts_matrozis.lesson_9.level_3.task_10;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    Product[] database = new Product[0];

    public void save(Product product) {
        Product[] newDatabase = Arrays.copyOf(database, database.length + 1);
        newDatabase[newDatabase.length - 1] = product;
        database = newDatabase;
    }

    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : database) {
            if (product.title.equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
