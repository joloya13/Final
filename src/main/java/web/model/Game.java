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
    private int dev;
    private int pub;
    private int genre;



    /**
     * Default constructor
     */

    public Game(){

    }// Game



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
        this.dev = dev;
        this.pub = pub;
        this.genre = genre;
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

    public void setPub(int pub) {
        this.pub = pub;
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
     * Getter method for genre.
     *
     * @return genre The genre of the game.
     */

    public int getGenre() {
        return genre;
    } // getGenre

    /**
     * Setter method for genre.
     *
     * @param genre The genre of the game.
     */

    public void setGenre(int genre) {
        this.genre = genre;
    } // setGenre


    /**
     * Getter method for developer
     *
     * @return dev The developer of the game
     */

    public int getDev() {
        return dev;
    } // getDev

    /**
     * Setter method for developer
     *
     * @param dev The developer of the game
     */

    public void setDev(int dev) {
        this.dev = dev;
    } // setDev

    /**
     * Getter method for publisher
     *
     * @return pub The publisher of the game.
     */

    public int getPub() {
        return pub;
    } // getPub

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
