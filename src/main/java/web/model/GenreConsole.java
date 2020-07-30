package web.model;

/************************************************************************************
 * @file GenreConsole.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class will handle holding on to the information that the user wants to
 * see in the game database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class GenreConsole {
    private int genreId;
    private String console;

    /**
     * Default Constructor
     */

    public GenreConsole() {
    } // GenreConsole

    /**
     * A getter method for returning the genreId
     *
     * @return genreId the unique genreId
     */

    public int getGenre() {
        return genreId;
    } // getGenre

    /**
     * A setter method for setting the genre
     *
     * @param genre The genre Id to bet set
     */

    public void setGenre(int genre) {
        this.genreId = genre;
    } // setGenre

    /**
     * A getter method for getting the console
     *
     * @return console The console object from the html
     */

    public String getConsole() {
        return console;
    } // getConsole

    /**
     * A setter method for setting the console name
     *
     * @param console the console name to be set
     */

    public void setConsole(String console) {
        this.console = console;
    } // setConsole
} // GenreConsole
