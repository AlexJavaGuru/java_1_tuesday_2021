package student_sergej_pereligin.lesson_9.level_3.Product;


public class InMemoryDatabaseImpl implements ProductDatabase {

    Product[] products; // old

    InMemoryDatabaseImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void save(Product product) {

        Product[] newProductArray = new Product[products.length + 1];
        newProductArray = copyOldToNew(products, newProductArray);
        newProductArray[newProductArray.length - 1] = product;
        products = newProductArray;

        //copy from old to new array
        //add product to new array
        //newProductArray[newProductArray.length - 1] = new product here
    }

    public Product[] copyOldToNew(Product[] products, Product[] newProductArray) {
        for (int i = 0; i < products.length; i++) {
            newProductArray[i] = products[i];
        }
        return newProductArray;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getTitle().equals(productTitle)) {
                return products[i];
            } else {
                System.out.println("No product with such name");
            }
        }
        return null;
    }
}

