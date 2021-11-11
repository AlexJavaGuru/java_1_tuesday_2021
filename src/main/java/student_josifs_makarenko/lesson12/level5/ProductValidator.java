package student_josifs_makarenko.lesson12.level5;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
