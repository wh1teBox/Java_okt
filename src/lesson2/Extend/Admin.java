package lesson2.Extend;
import lombok.*;

public class Admin extends User {

    private Role role = Role.MANAGER;

    public Admin() {
    }

    public Admin(int id, String name, String surname, Role role) {
        super(id, name, surname);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void greeting() {
        System.out.println("Aloha from admin");
    }
}
