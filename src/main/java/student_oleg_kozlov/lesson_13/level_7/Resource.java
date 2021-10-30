package student_oleg_kozlov.lesson_13.level_7;

import java.util.Objects;

// Task_34
abstract class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(name, resource.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
