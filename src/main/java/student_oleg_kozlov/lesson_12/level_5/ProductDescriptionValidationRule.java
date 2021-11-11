package student_oleg_kozlov.lesson_12.level_5;

// Task_44
class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription() == null || product.getDescription().isBlank()) {
            return;
        }
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description length can not be bigger than 2000 characters", "description");
        }

        if (!product.getDescription().matches("^[a-zA-Z0-9]*$")) {
            throw new ValidationException("RULE-8", "Description can contain digits and English letters only", "description");
        }
    }
}
