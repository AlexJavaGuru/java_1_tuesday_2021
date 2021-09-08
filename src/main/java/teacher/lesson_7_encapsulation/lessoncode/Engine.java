package teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

public class Engine {

    int cil;
    String type;

    public Engine(int cil, String type) {
        this.cil = cil;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return cil == engine.cil && Objects.equals(type, engine.type);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cil=" + cil +
                ", type='" + type + '\'' +
                '}';
    }
}
