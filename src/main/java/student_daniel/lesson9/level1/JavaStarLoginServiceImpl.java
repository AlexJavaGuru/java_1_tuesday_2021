package student_daniel.lesson9.level1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {
    //Task 1
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
