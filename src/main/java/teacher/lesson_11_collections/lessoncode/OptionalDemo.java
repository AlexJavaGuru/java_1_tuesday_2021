package teacher.lesson_11_collections.lessoncode;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        ProductService service = new ProductService();

        Optional<Product> productById = service.findProductById(1L);

        if (productById.isPresent()) {
            Product product = productById.get();
            //some code
        }
    }
}
