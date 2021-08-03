package student_alex_ivanov;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Тут у вас что-то не правильно..." +
        "Лучше сделать вот так:" +
        "")
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Im student ART");
        System.out.println("Jurmala one Love");
        System.out.println("JavaGuru rules");
    }
}
