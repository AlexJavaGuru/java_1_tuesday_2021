package student_oleg_kozlov.lesson_12.level_5;

import java.util.List;

// Task_37, Task_38, Task_46
class ProductValidatorImplTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private ProductValidator validator = new ProductValidatorImpl(
            new ProductTitleValidationRule(),
            new ProductPriceValidationRule(),
            new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();

        test.rule5_v1();
        test.rule6_v1();

        test.rule7_v1();
        test.rule8_v1();
        test.rule8_v2();

        test.title_price();
        test.title_description();
        test.price_description();
        test.title_price_description();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_v1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1_v1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_v1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_v2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_v2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1_v2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_v2");
    }

    public void rule2_v1() {
        Product product = new Product(generateString(2), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2_v1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2_v1");
        checkResult(exceptions.get(0).getDescription().equals("Title length can not be less than 3 characters"), "rule2_v1");
    }

    public void rule3_v1() {
        Product product = new Product(generateString(101), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3_v1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3_v1");
        checkResult(exceptions.get(0).getDescription().equals("Title length can not be bigger than 100 characters"), "rule3_v1");
    }

    public void rule4_v1() {
        Product product = new Product("Продукт", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4_v1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4_v1");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain digits and English letters only"), "rule4_v1");
    }

    public void rule4_v2() {
        Product product = new Product("<???>", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4_v2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4_v2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4_v2");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain digits and English letters only"), "rule4_v2");
    }

    public void rule5_v1() {
        Product product = new Product("title0", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5_v1");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5_v1");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5_v1");
    }

    public void rule6_v1() {
        Product product = new Product("title9", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6_v1");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6_v1");
        checkResult(exceptions.get(0).getDescription().equals("Price must be bigger than 0"), "rule6_v1");
    }

    public void rule7_v1() {
        Product product = new Product("title", 1, generateString(2001));
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7_v1");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7_v1");
        checkResult(exceptions.get(0).getDescription().equals("Description length can not be bigger than 2000 characters"), "rule7_v1");
    }

    public void rule8_v1() {
        Product product = new Product("title", 1, "Продукт");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8_v1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8_v1");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8_v1");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain digits and English letters only"), "rule8_v1");
    }

    public void rule8_v2() {
        Product product = new Product("title", 1, "<???>");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8_v2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8_v2");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8_v2");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain digits and English letters only"), "rule8_v2");
    }

    public void title_price() {
        Product product = new Product(" ", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "title_price");
        ValidationException titleExpected = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException priceExpected = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        checkResult(exceptions.contains(titleExpected), "title_price");
        checkResult(exceptions.contains(priceExpected), "title_price");
    }

    public void title_description() {
        Product product = new Product(" ", 1, "description?>");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "title_description");
        ValidationException titleExpected = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException descriptionExpected = new ValidationException("RULE-8", "Description can contain digits and English letters only", "description");
        checkResult(exceptions.contains(titleExpected), "title_description");
        checkResult(exceptions.contains(descriptionExpected), "title_description");
    }

    public void price_description() {
        Product product = new Product("title", -1, "description?");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "price_description");
        ValidationException priceExpected = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        ValidationException descriptionExpected = new ValidationException("RULE-8", "Description can contain digits and English letters only", "description");
        checkResult(exceptions.contains(priceExpected), "price_description");
        checkResult(exceptions.contains(descriptionExpected), "price_description");
    }

    public void title_price_description() {
        Product product = new Product(" ", -1, "description?");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "title_price_description");
        ValidationException titleExpected = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException priceExpected = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        ValidationException descriptionExpected = new ValidationException("RULE-8", "Description can contain digits and English letters only", "description");
        checkResult(exceptions.contains(titleExpected), "title_price_description");
        checkResult(exceptions.contains(priceExpected), "title_price_description");
        checkResult(exceptions.contains(descriptionExpected), "title_price_description");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(TEXT_GREEN + testName + " = OK" + TEXT_RESET);
        } else {
            System.out.println(TEXT_RED + testName + " = FAIL" + TEXT_RESET);
        }
    }

    private String generateString(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += "a";
        }
        return result;
    }
}
