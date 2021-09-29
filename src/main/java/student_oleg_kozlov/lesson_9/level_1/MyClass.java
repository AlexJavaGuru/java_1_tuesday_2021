package student_oleg_kozlov.lesson_9.level_1;

import java.util.Objects;

// Task_3
class MyClass implements Comparable<MyClass> {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyClass(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(MyClass other) {
        if (this.id == other.getId()) {
            return 0;
        } else if (this.id > other.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
