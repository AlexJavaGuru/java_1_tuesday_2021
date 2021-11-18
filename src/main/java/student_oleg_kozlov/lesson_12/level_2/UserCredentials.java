package student_oleg_kozlov.lesson_12.level_2;

import java.util.List;

// Task_8, Task_15, Task_16
class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
