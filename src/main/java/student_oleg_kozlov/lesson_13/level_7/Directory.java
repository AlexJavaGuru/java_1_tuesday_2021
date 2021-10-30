package student_oleg_kozlov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

// Task_34
class Directory extends Resource {
    private List<Resource> content;

    public Directory(String name) {
        super(name);
        content = new ArrayList<>();
    }

    public List<Resource> getContent() {
        return content;
    }

    public void add(Resource resource) {
        if (content.contains(resource)) {
            throw new IllegalArgumentException("'" + resource.getName() + "'" + " already exists in the directory");
        }
        content.add(resource);
    }

    public void delete(Resource resource) {
        if (!content.contains(resource)) {
            throw new IllegalArgumentException("'" + resource.getName() + "'" + " doesn't exist in the directory");
        }
        content.remove(resource);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
