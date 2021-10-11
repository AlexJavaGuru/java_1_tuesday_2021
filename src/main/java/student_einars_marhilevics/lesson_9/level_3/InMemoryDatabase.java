package student_einars_marhilevics.lesson_9.level_3;

class InMemoryDatabase implements ProductDatabase{

    Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] copy = new Product[products.length + 1];
        System.arraycopy(products, 0, copy, 0, products.length);
        products = copy;
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
