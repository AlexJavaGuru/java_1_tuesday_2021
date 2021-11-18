package student_julija_kuzmicova.lesson_9.level_3;

//Task_8
class InMemoryDatabaseImpl implements ProductDatabase{

    Product[] productBase = new Product[0];

    @Override
    public void save(Product product) {
        Product[] newBase = new Product[productBase.length + 1];
        for(int i = 0; i < productBase.length; i++) {
            newBase[i] = productBase[i];
        }
        productBase = newBase;
        productBase[productBase.length - 1] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for(Product product : productBase) {
            if(product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
