package student_josifs_makarenko.lesson12.level5;

import java.util.List;

public class ProductValidatorImplTest {
    private ProductValidator validator = new ProductValidatorImpl(
            new ProductTitleValidationRule(),
            new ProductPriceValidationRule(),
            new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1V1();
        test.rule1V2();
        test.rule2V1();
        test.rule3V1();
        test.rule4V1();
        test.rule4V2();

        test.rule5V1();
        test.rule6V1();

        test.rule7V1();
        test.rule8V1();
        test.rule8V2();
    }

    public void rule1V1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1V1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1V1");
        checkResult(exceptions.get(0).getDescription().equals("CAN NOT BE EMPTY"), "rule1V1");
    }

    public void rule1V2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1V2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1V2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1V2");
        checkResult(exceptions.get(0).getDescription().equals("CAN NOT BE EMPTY"), "rule1V2");
    }

    public void rule2V1() {
        Product product = new Product("ab", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2V1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2V1");
        checkResult(exceptions.get(0).getDescription().equals("MIN 3 CHARACTERS"), "rule2V1");
    }

    public void rule3V1() {
        Product product = new Product("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3V1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3V1");
        checkResult(exceptions.get(0).getDescription().equals("MAX 100 CHARACTERS"), "rule3V1");
    }

    public void rule4V1() {
        Product product = new Product("Продукт", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4V1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4V1");
        checkResult(exceptions.get(0).getDescription().equals("ENGLISH LETTERS ONLY"), "rule4V1");
    }

    public void rule4V2() {
        Product product = new Product("<???>", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4V2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4V2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4V2");
        checkResult(exceptions.get(0).getDescription().equals("ENGLISH LETTERS ONLY"), "rule4V2");
    }

    public void rule5V1() {
        Product product = new Product("title0", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5V1");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5V1");
        checkResult(exceptions.get(0).getDescription().equals("CANNOT BE EMPTY"), "rule5V1");
    }

    public void rule6V1() {
        Product product = new Product("title9", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6V1");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6V1");
        checkResult(exceptions.get(0).getDescription().equals("CANNOT BE LESS THEN 0"), "rule6V1");
    }

    public void rule7V1() {
        Product product = new Product("title", 1, "_____________¶____¶ \n" +
                "_________¶_¶¶¶¶¶¶¶¶¶¶ \n" +
                "_____¶¶¶¶¶¶¶_________¶ \n" +
                "___¶¶¶¶¶_____________¶ \n" +
                "___¶_________________¶ \n" +
                "____¶________________¶¶ \n" +
                "____¶¶________________¶ \n" +
                "_____¶________________¶¶ \n" +
                "_____¶¶_______¶¶¶____¶¶¶ \n" +
                "______¶_____¶¶___¶¶_¶___¶ \n" +
                "______¶_____¶¶_____¶____¶ \n" +
                "______¶¶____¶______¶¶¶¶¶¶¶ \n" +
                "_______¶____¶¶__¶¶¶_____¶¶ \n" +
                "______¶¶¶¶____¶¶¶¶_____¶¶ \n" +
                "______¶¶¶_______________¶¶ \n" +
                "_______¶¶¶______________¶¶ \n" +
                "________¶_____¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_______¶¶_______¶¶¶¶¶ \n" +
                "______¶¶¶¶¶_____¶ \n" +
                "___¶¶¶¶__¶¶¶¶¶¶¶¶ \n" +
                "__¶¶____¶¶_____¶¶ \n" +
                "_¶¶_____¶¶______¶¶ \n" +
                "¶¶______¶¶_______¶¶ \n" +
                "_¶¶¶¶¶___¶¶______¶¶ \n" +
                "_¶__¶¶¶¶¶¶_______¶¶ \n" +
                "¶¶____¶___________¶¶ \n" +
                "¶____¶¶__________¶¶¶ \n" +
                "¶____¶¶____________¶ \n" +
                "¶_____¶___________¶¶¶ \n" +
                "¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶_¶ \n" +
                "¶______¶_________¶___¶ \n" +
                "¶¶¶¶__¶__________¶_¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "___¶¶¶¶¶¶¶¶¶____¶ \n" +
                "___¶¶___¶__¶____¶ \n" +
                "___¶____¶__¶____¶ \n" +
                "___¶¶___¶__¶____¶¶ \n" +
                "__¶_______¶¶¶¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_____________¶____¶ \n" +
                "_________¶_¶¶¶¶¶¶¶¶¶¶ \n" +
                "_____¶¶¶¶¶¶¶_________¶ \n" +
                "___¶¶¶¶¶_____________¶ \n" +
                "___¶_________________¶ \n" +
                "____¶________________¶¶ \n" +
                "____¶¶________________¶ \n" +
                "_____¶________________¶¶ \n" +
                "_____¶¶_______¶¶¶____¶¶¶ \n" +
                "______¶_____¶¶___¶¶_¶___¶ \n" +
                "______¶_____¶¶_____¶____¶ \n" +
                "______¶¶____¶______¶¶¶¶¶¶¶ \n" +
                "_______¶____¶¶__¶¶¶_____¶¶ \n" +
                "______¶¶¶¶____¶¶¶¶_____¶¶ \n" +
                "______¶¶¶_______________¶¶ \n" +
                "_______¶¶¶______________¶¶ \n" +
                "________¶_____¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_______¶¶_______¶¶¶¶¶ \n" +
                "______¶¶¶¶¶_____¶ \n" +
                "___¶¶¶¶__¶¶¶¶¶¶¶¶ \n" +
                "__¶¶____¶¶_____¶¶ \n" +
                "_¶¶_____¶¶______¶¶ \n" +
                "¶¶______¶¶_______¶¶ \n" +
                "_¶¶¶¶¶___¶¶______¶¶ \n" +
                "_¶__¶¶¶¶¶¶_______¶¶ \n" +
                "¶¶____¶___________¶¶ \n" +
                "¶____¶¶__________¶¶¶ \n" +
                "¶____¶¶____________¶ \n" +
                "¶_____¶___________¶¶¶ \n" +
                "¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶_¶ \n" +
                "¶______¶_________¶___¶ \n" +
                "¶¶¶¶__¶__________¶_¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "___¶¶¶¶¶¶¶¶¶____¶ \n" +
                "___¶¶___¶__¶____¶ \n" +
                "___¶____¶__¶____¶ \n" +
                "___¶¶___¶__¶____¶¶ \n" +
                "__¶_______¶¶¶¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_____________¶____¶ \n" +
                "_________¶_¶¶¶¶¶¶¶¶¶¶ \n" +
                "_____¶¶¶¶¶¶¶_________¶ \n" +
                "___¶¶¶¶¶_____________¶ \n" +
                "___¶_________________¶ \n" +
                "____¶________________¶¶ \n" +
                "____¶¶________________¶ \n" +
                "_____¶________________¶¶ \n" +
                "_____¶¶_______¶¶¶____¶¶¶ \n" +
                "______¶_____¶¶___¶¶_¶___¶ \n" +
                "______¶_____¶¶_____¶____¶ \n" +
                "______¶¶____¶______¶¶¶¶¶¶¶ \n" +
                "_______¶____¶¶__¶¶¶_____¶¶ \n" +
                "______¶¶¶¶____¶¶¶¶_____¶¶ \n" +
                "______¶¶¶_______________¶¶ \n" +
                "_______¶¶¶______________¶¶ \n" +
                "________¶_____¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "_______¶¶_______¶¶¶¶¶ \n" +
                "______¶¶¶¶¶_____¶ \n" +
                "___¶¶¶¶__¶¶¶¶¶¶¶¶ \n" +
                "__¶¶____¶¶_____¶¶ \n" +
                "_¶¶_____¶¶______¶¶ \n" +
                "¶¶______¶¶_______¶¶ \n" +
                "_¶¶¶¶¶___¶¶______¶¶ \n" +
                "_¶__¶¶¶¶¶¶_______¶¶ \n" +
                "¶¶____¶___________¶¶ \n" +
                "¶____¶¶__________¶¶¶ \n" +
                "¶____¶¶____________¶ \n" +
                "¶_____¶___________¶¶¶ \n" +
                "¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶_¶ \n" +
                "¶______¶_________¶___¶ \n" +
                "¶¶¶¶__¶__________¶_¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \n" +
                "___¶¶¶¶¶¶¶¶¶____¶ \n" +
                "___¶¶___¶__¶____¶ \n" +
                "___¶____¶__¶____¶ \n" +
                "___¶¶___¶__¶____¶¶ \n" +
                "__¶_______¶¶¶¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶ \n" +
                "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7V1");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7V1");
        checkResult(exceptions.get(0).getDescription().equals("MAX 2000 CHARACTERS"), "rule7V1");
    }

    public void rule8V1() {
        Product product = new Product("title", 1, "Продукт");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8V1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8V1");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8V1");
        checkResult(exceptions.get(0).getDescription().equals("ENGLISH LETTERS ONLY"), "rule8V1");
    }

    public void rule8V2() {
        Product product = new Product("title", 1, "<???>");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8V2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8V2");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8V2");
        checkResult(exceptions.get(0).getDescription().equals("ENGLISH LETTERS ONLY"), "rule8V2");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
