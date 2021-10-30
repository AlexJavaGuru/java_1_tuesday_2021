package student_oleg_kozlov.lesson_9.level_3;

// Task_8
class InMemoryDatabaseImpl implements ProductDatabase {

    Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        products = tmp;
        products[products.length - 1] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
