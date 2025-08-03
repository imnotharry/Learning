public class UserComment {
    private String username;
    private String email;
    private String comment;

    public UserComment(String username, String email, String comment) {
        this.username = username;
        this.email = email;
        this.comment = comment;
    }

    public String toString() {
        return String.format("UserComment{username='%s', email='%s', comment='%s'}", username, email, comment);
    }
}