package student_oleg_kozlov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

// Task_34
class File extends Resource {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name=" + getName() +
                ", size='" + size + '\'' +
                '}';
    }
}
