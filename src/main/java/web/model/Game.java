package web.model;

/************************************************************************************
 * @file Game.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.beans.factory.annotation.Autowired;

/************************************************************************************
 * This class handles game objects outside of the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class Game {
    //columns from the database
    private String name;
    private String rDate;
    private String genre;
    private String console;
    private String dev;
    private String pub;

    /**
     * Default constructor
     */

    public Game(){

    }// Game

    /**
     * A constructor to create a game object with chosen attributes.
     *
     * @param name The name of the Game
     * @param rDate The release date
     * @param genre The genre
     * @param console The game's console
     * @param dev The developer of the game
     * @param pub The publisher of the game
     */

    public Game(String name, String rDate, String genre, String console, String dev, String pub){
        this.name = name;
        this.console = console;
        this.dev = dev;
        this.rDate = rDate;
        this.genre = genre;
        this.pub = pub;
    } // Game

    /**
     * Getter method for release date.
     *
     * @return rDate The release date of the game.
     */

    public String getrDate() {
        return rDate;
    } // getrDate

    /**
     * Setter method for release date.
     *
     * @param rDate The release date of the game.
     */

    public void setrDate(String rDate) {
        this.rDate = rDate;
    } // setrDate

    /**
     * Getter method for genre.
     *
     * @return genre The genre of the game.
     */

    public String getGenre() {
        return genre;
    } // getGenre

    /**
     * Setter method for genre.
     *
     * @param genre The genre of the game.
     */

    public void setGenre(String genre) {
        this.genre = genre;
    } // setGenre

    /**
     * Getter method for console.
     *
     * @return console The console that the game plays on.
     */

    public String getConsole() {
        return console;
    } // getConsole

    /**
     * Setter method for console.
     *
     * @param console The name of the console that the game is on.
     */

    public void setConsole(String console) {
        this.console = console;
    } // setConsole

    /**
     * Getter method for developer
     *
     * @return dev The developer of the game
     */

    public String getDev() {
        return dev;
    } // getDev

    /**
     * Setter method for developer
     *
     * @param dev The developer of the game
     */

    public void setDev(String dev) {
        this.dev = dev;
    } // setDev

    /**
     * Getter method for publisher
     *
     * @return pub The publisher of the game.
     */

    public String getPub() {
        return pub;
    } // getPub

    /**
     * Setter method for publisher
     *
     * @param pub The name of the publisher for the game.
     */

    public void setPub(String pub) {
        this.pub = pub;
    } // setPub

    /**
     * Getter method for the name of the game
     *
     * @return name The name of the game
     */

    public String getName() {
        return name;
    } // getName

    /**
     * Setter method for naming the game
     *
     * @param name The name of the game
     */

    public void setName(String name) {
        this.name = name;
    } // setName
} //Game
