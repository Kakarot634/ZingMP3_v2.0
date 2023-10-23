package Model;

public class User {
    private String email,name,password,rePassword;
    public int phone;

    public User(String email, String name, String password, String rePassword, int phone) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.rePassword = rePassword;
        this.phone = phone;
    }

    public User(String name, String email, String password) {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
