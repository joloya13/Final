package web.model;

/************************************************************************************
 * @file Genre.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class handles the genre objects outside the table.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class Genre {
    private int genreId;
    private String genreName;

    /**
     * Default constructor
     */

    public Genre() {

    } // Genre

    /**
     * Getter method for genreId
     *
     * @return genreId The unique id of the genre
     */

    public int getGenreId() {
        return genreId;
    }// genreId

    /**
     * Setter method for genreId
     *
     * @param genreId The unique if of the genre
     */

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    } // setGenreId

    /**
     * Getter method for GenreName
     *
     * @return genreName The name of the genre.
     */

    public String getGenreName() {
        return genreName;
    } // getGenreName

    /**
     * Setter method for GenreName
     *
     * @param genreName The name of the genre.
     */

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    } // setGenreName
} // Genre
