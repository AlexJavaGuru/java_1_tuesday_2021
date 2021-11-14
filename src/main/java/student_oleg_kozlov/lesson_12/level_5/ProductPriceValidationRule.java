package student_oleg_kozlov.lesson_12.level_5;

// Task_42
class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }

        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        }
    }
}
