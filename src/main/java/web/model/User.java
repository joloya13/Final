package web.model;

/************************************************************************************
 * @file User.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class will handle user information outside of the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class User {
    private int userId;
    private String userName;
    private String password;
    private String role;
    private int enabled;
    private int Genre_genreId;

    /**
     * Default constructor
     */

    public User() {
    } // User

    /**
     * A getter method for returning the userId.
     *
     * @return userId
     */

    public int getUserId() {
        return userId;
    } // getUserId

    /**
     * Setter method for setting the userId
     *
     * @param userId the unique id of the user
     */

    public void setUserId(int userId) {
        this.userId = userId;
    } // setUserId

    /**
     * Getter method for getting the userName
     *
     * @return userName the name of the user
     */

    public String getUserName() {
        return userName;
    } // getUserName

    /**
     * Setter method for setting the userName
     *
     * @param userName The username to be set
     */

    public void setUserName(String userName) {
        this.userName = userName;
    } // setUserName

    /**
     * Getter method for returning the password.
     *
     * @return password
     */

    public String getPassword() {
        return password;
    } // getPassword

    /**
     * Setter method for password
     *
     * @param password the password to be set
     */

    public void setPassword(String password) {
        this.password = password;
    } // setPassword

    /**
     * Getter method for role
     *
     * @return role The role of the user.
     */

    public String getRole() {
        return role;
    } // getRole

    /**
     * Setter method for role.
     *
     * @param role the role to be set
     */

    public void setRole(String role) {
        this.role = role;
    } // setRole

    /**
     * Getter method for Enabled
     *
     * @return enabled the enabled to be returned
     */

    public int getEnabled() {
        return enabled;
    } // getEnabled

    /**
     * Setter method for Enabled
     *
     * @param enabled The enabled to be set
     */

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    } // setEnabled

    /**
     * Getter method for genre Id
     *
     * @return Genre_genreId the genreId to be returned
     */

    public int getGenre_genreId() {
        return Genre_genreId;
    } // getGenre_genreId

    /**
     * Setter method for GenreId
     *
     * @param genre_genreId The genreId to be set
     */

    public void setGenre_genreId(int genre_genreId) {
        Genre_genreId = genre_genreId;
    } // setGenre_genreId
} // User
