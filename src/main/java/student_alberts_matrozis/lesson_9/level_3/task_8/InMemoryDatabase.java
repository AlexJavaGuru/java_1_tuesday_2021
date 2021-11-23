package student_alberts_matrozis.lesson_9.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabase implements ProductDatabase{

    Product[] database = new Product[0];

    public void save(Product product) {
        Product[] newDatabase = Arrays.copyOf(database, database.length + 1);
        newDatabase[newDatabase.length - 1] = product;
        database = newDatabase;
    }

    public Product findByTitle(String productTitle) {
        for (Product product : database) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
