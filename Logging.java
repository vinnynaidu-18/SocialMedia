public class Logging {
    public String userName;
    public String password;


    public Logging(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    boolean login(String userName, String password) {
        return (this.userName.equals(userName) && this.password.equals(password));

    }
}