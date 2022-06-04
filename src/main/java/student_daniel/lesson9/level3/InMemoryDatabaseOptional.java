package student_daniel.lesson9.level3;

import java.util.Optional;

public class InMemoryDatabaseOptional implements ProductDatabaseOptional {
    //Task 10
    Product[] myProducts = new Product[0];

    @Override
    public void save(Product product) {
        Product[] nextFreeIndex = new Product[myProducts.length + 1];
        for (int i = 0; i < myProducts.length; i++) {
            nextFreeIndex[i] = myProducts[i];
        }
        myProducts = nextFreeIndex;
        myProducts[myProducts.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product myProduct : myProducts) {
            if (myProduct.getTitle().equals(productTitle)) {
                return Optional.of(myProduct);
            }
        }
        return Optional.empty();
    }
}
