package student_oleg_kozlov.lesson_12.level_5;

// Task_40
class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isBlank()) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }

        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title length can not be less than 3 characters", "title");
        }

        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title length can not be bigger than 100 characters", "title");
        }

        if (!product.getTitle().matches("^[a-zA-Z0-9]*$")) {
            throw new ValidationException("RULE-4", "Title can contain digits and English letters only", "title");
        }

    }
}
