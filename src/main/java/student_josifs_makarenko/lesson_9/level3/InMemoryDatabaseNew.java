package student_josifs_makarenko.lesson_9.level3;

import java.util.Optional;

public class InMemoryDatabaseNew implements ProductDatabaseNew {
////task 10

    public static void main(String[] args) {
        InMemoryDatabaseNew inMemoryDatabaseNewVersion = new InMemoryDatabaseNew();
        inMemoryDatabaseNewVersion.save(new ProductNewVersion("Apple"));
        inMemoryDatabaseNewVersion.save(new ProductNewVersion("Orange"));
        System.out.println(inMemoryDatabaseNewVersion.findByTitle(("Orange")));
        System.out.println(inMemoryDatabaseNewVersion.findByTitle(("Apple")));
    }

    private ProductNewVersion[] productList = new ProductNewVersion[0];

    @Override
    public void save(ProductNewVersion productNewVersion) {
        ProductNewVersion[] fakeArray = new ProductNewVersion[productList.length + 1];

        System.arraycopy(productList, 0, fakeArray, 0, fakeArray.length - 1);

        fakeArray[productList.length] = productNewVersion;

        productList = fakeArray;
    }

    @Override
    public Optional<ProductNewVersion> findByTitle(String productTitle) {
        for (ProductNewVersion productNewVersion : productList) {
            if (productNewVersion.getTitle().equals(productTitle)) {
                return Optional.of(productNewVersion);
            }
        }
        return Optional.empty();
    }
}


