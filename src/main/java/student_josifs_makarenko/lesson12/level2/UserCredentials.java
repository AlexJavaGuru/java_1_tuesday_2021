package student_josifs_makarenko.lesson12.level2;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole (Role role) {
        return roles.contains(role);
    }
}
