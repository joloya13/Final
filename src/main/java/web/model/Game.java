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

    public String getGenre_genreName() {
        return Genre_genreName;
    }

    public void setGenre_genreName(String genre_genreName) {
        Genre_genreName = genre_genreName;
    }

    /**
     * Default constructor
     */

    public Game(){

    }// Game


    public int getDeveloper_developerId() {
        return Developer_developerId;
    }

    public void setDeveloper_developerId(int developer_developerId) {
        Developer_developerId = developer_developerId;
    }

    public int getPublisher_publisherId() {
        return Publisher_publisherId;
    }

    public void setPublisher_publisherId(int publisher_publisherId) {
        Publisher_publisherId = publisher_publisherId;
    }

    public int getGenre_genreId() {
        return Genre_genreId;
    }

    public void setGenre_genreId(int genre_genreId) {
        Genre_genreId = genre_genreId;
    }

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


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

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
     * Setter method for publisher
     *
     * @param pub The name of the publisher for the game.
     */


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
