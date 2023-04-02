package lesson2.abstraction;

public class Customer extends User{
    private String email;

    public Customer() {
    }

    public Customer(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void aaa(String s) {
        System.out.println("Abstract method"+ s);
    }
}
