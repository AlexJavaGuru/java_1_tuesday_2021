package student_josifs_makarenko.lesson_9.level3;

import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase{
//task 8
    private Product[] productList = new Product[0];

    @Override
    public void save(Product product) {
        Product[] fakeArray = new Product[productList.length + 1];

        for (int i = 0; i < fakeArray.length - 1; i++) {
            fakeArray[i] = productList[i];
        }

        fakeArray[productList.length] = product;

        productList = fakeArray;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
