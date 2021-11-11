package student_josifs_makarenko.lesson12.level5;

public class ProductPriceValidationRule implements FieldValidationRule{

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getCost() == null) {
            throw new ValidationException("RULE-5", "CANNOT BE EMPTY", "price");
        }

        if (product.getCost() <= 0) {
            throw new ValidationException("RULE-6", "CANNOT BE LESS THEN 0", "price");
        }
    }
}
