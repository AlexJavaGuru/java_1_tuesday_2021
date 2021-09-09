package student_sergej_pereligin.lesson_3.level_7;

import org.w3c.dom.ls.LSOutput;

public class Apple {
    String color;
    int size;
    Apple(String color, int size){
        this.color=color;
        this.size=size;
    }
    void Configuration(){
        System.out.println(this.color + this.size);
    }

}
