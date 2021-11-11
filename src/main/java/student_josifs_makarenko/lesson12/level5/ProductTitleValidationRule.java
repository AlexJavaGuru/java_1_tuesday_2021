package student_josifs_makarenko.lesson12.level5;

public class ProductTitleValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isBlank()) {
            throw new ValidationException("RULE-1", "CAN NOT BE EMPTY", "title");
        }

        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "MIN 3 CHARACTERS", "title");
        }

        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "MAX 100 CHARACTERS", "title");
        }

        if (!product.getTitle().matches("^[a-zA-Z0-9]*$")) {
            throw new ValidationException("RULE-4", "ENGLISH LETTERS ONLY", "title");
        }
    }
}
