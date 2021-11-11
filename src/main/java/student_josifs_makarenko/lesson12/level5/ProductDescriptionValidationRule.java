package student_josifs_makarenko.lesson12.level5;

public class ProductDescriptionValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription() == null || product.getDescription().isBlank()) {
            return;
        }
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "MAX 2000 CHARACTERS", "description");
        }

        if (!product.getDescription().matches("^[a-zA-Z0-9]*$")) {
            throw new ValidationException("RULE-8", "ENGLISH LETTERS ONLY", "description");
        }
    }
}
