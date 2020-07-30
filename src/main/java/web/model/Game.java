package web.model;

/************************************************************************************
 * @file Game.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class handles game objects outside of the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class Game {


    //columns from the database
    private int gameId;
    private String gameName;
    private int rDate;
    private double score;
    private int Developer_developerId;
    private int Publisher_publisherId;
    private int Genre_genreId;
    private String Genre_genreName;

    /**
     * A getter method to return the Genre Name
     *
     * @return Genre_genreName the name of the genre
     */

    public String getGenre_genreName() {
        return Genre_genreName;
    } // getGenre_genreName

    /**
     * A setter method to set the Genre name
     *
     * @param genre_genreName The name of the genre to be set
     */

    public void setGenre_genreName(String genre_genreName) {
        Genre_genreName = genre_genreName;
    } // setGenre_genreName

    /**
     * Default constructor
     */

    public Game(){

    }// Game

    /**
     * A getter method to return the Developer id
     *
     * @return The id of the developer who made the game
     */

    public int getDeveloper_developerId() {
        return Developer_developerId;
    } // getDeveopler_developerId

    /**
     * setDeveloper_developerId
     *
     * @param developer_developerId the developer id to be set
     */

    public void setDeveloper_developerId(int developer_developerId) {
        Developer_developerId = developer_developerId;
    } // setDeveloper_developerId

    /**
     * Getter method for the publisher Id.
     *
     * @return Publisher_publisherId The id of the publisher who made the game
     */

    public int getPublisher_publisherId() {
        return Publisher_publisherId;
    } // getPublisher_publisherId

    /**
     * A setter method for publisher Id
     *
     * @param publisher_publisherId The value that publisher id should be set to
     */

    public void setPublisher_publisherId(int publisher_publisherId) {
        Publisher_publisherId = publisher_publisherId;
    } // setPublisher_publisherId

    /**
     * A getter method for getting the genre Id
     *
     * @return the genre Id that belongs to the game
     */

    public int getGenre_genreId() {
        return Genre_genreId;
    } // getGenre_genreId

    /**
     * A setter method for genreId
     *
     * @param genre_genreId The value that genreId should be set to
     */

    public void setGenre_genreId(int genre_genreId) {
        Genre_genreId = genre_genreId;
    } // setGenre_genreId

    /**
     * A constructor to create a game object with chosen attributes.
     *
     * @param score The score of the game
     * @param gameId Id of the game
     * @param gameName The name of the Game
     * @param rDate The release date
     * @param genre The genre
     * @param dev The developer of the game
     * @param pub The publisher of the game
     */
    public Game(int gameId, String gameName, int rDate, double score, int dev, int pub, int genre) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.rDate = rDate;
        this.score = score;
        this.Developer_developerId = dev;
        this.Publisher_publisherId = pub;
        this.Genre_genreId = genre;
    } // Game

    /**
     * A getter method to return the GameId
     *
     * @return gameId The unique id of the game
     */

    public int getGameId() {
        return gameId;
    } // getGameid

    /**
     * A setter method to set the gameId
     *
     * @param gameId the id that gameId should be set to
     */

    public void setGameId(int gameId) {
        this.gameId = gameId;
    } // setGameId

    /**
     * A getter method to return the score of the game
     *
     * @return score the user score of the game
     */

    public double getScore() {
        return score;
    } // getScore

    /**
     * A setter method to set the score of the game
     *
     * @param score the user score of the game to be set
     */

    public void setScore(double score) {
        this.score = score;
    } // setScore

    /**
     * Getter method for release date.
     *
     * @return rDate The release date of the game.
     */

    public int getrDate() {
        return rDate;
    } // getrDate

    /**
     * Setter method for release date.
     *
     * @param rDate The release date of the game.
     */

    public void setrDate(int rDate) {
        this.rDate = rDate;
    } // setrDate

    /**
     * Getter method for the name of the game
     *
     * @return name The name of the game
     */

    public String getGameName() {
        return gameName;
    } // getName

    /**
     * Setter method for naming the game
     *
     * @param gameName The name of the game
     */

    public void setGameName(String gameName) {
        this.gameName = gameName;
    } // setName
} //Game
