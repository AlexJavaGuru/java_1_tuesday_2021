package student_josifs_makarenko.lesson12.level5;

import java.util.Objects;

public class Product {
    private String title;
    private Integer cost;
    private String description;

    public Product(String title, Integer cost, String description) {
        this.title = title;
        this.cost = cost;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && Objects.equals(title, product.title) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, cost, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
