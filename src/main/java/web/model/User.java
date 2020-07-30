package web.model;

public class User {
    private int userId;
    private String userName;
    private String password;
    private String role;
    private int enabled;
    private int Genre_genreId;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getGenre_genreId() {
        return Genre_genreId;
    }

    public void setGenre_genreId(int genre_genreId) {
        Genre_genreId = genre_genreId;
    }
}
