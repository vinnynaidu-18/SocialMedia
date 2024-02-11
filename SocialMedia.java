public class SocialMedia {
    private String userName;
    private String password;
    public SocialMedia(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    boolean login(String userName, String password) {
        return (this.userName.equals(userName) && this.password.equals(password));

    }
}
