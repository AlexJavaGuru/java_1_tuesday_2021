package student_josifs_makarenko.lesson_9.level1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {
//task 1
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
