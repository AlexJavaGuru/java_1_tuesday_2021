package student_ruslan_pankratov.lesson_2.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Давайте сразу привыкнем не писать вложенные классы, когда это не нужно. Переименуйте Класс через" +
        "Refactoring -> Rename и удалите лишний, чтобы остался только LoginService")
public class Task_7 {

}

class LoginService {

    public static void main(String[] args) {
        System.out.println("You can login!");
    }

}
