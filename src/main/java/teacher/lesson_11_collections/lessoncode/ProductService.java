package teacher.lesson_11_collections.lessoncode;

import java.util.List;
import java.util.Optional;

public class ProductService {

    private List<Product> products;

    public Optional<Product> findProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
