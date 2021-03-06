package web.dao;

/************************************************************************************
 * @file GameDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Game;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.GenreConsole;

/************************************************************************************
 * This class will function as a handler for the `Game` table in the database. It functions as a getter,
 * setter, and modifier.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class GameDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    /**
     * This method will return a list of the video games.
     *
     * @return list Comprehensive list of the games.
     */

    public List<Game> list(){
        String q = "Select * from game limit 50"; //String query

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    } // list

    /**
     * A method to return a list of all the games that the user wants to see
     * based off of their console and genre of choice.
     *
     * @param genre An object that contains the genre and console specified by the user in search.html
     * @return list A list of the parsed games.
     */

    public List<Game> list(int genre){
        String q = "Select * from game where Genre_genreId = "+genre+" limit 50"; //String query

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }

    /**
     * A method to return the list of games that corresponds with the user's preferred genre.
     *
     * @param genreConsole the genreconsole that contains both datas
     * @return list a list of games that contains both specified genre and console
     */

    public List<Game> list(GenreConsole genreConsole){

        String q = String.format("Select * from game where Genre_genreId = '%d' and gameId in (select Game_gameId from port where Console_consoleName = '%s')",genreConsole.getGenre(),genreConsole.getConsole() ); //String query

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        System.out.println(genreConsole.getConsole());
        System.out.println(genreConsole.getGenre());
        return list;
    } // list

    /**
     * Saves the game into the tables.
     *
     * @param game Game object to be inserted into the table.
     */

    public void save(Game game) {

    } // save

    /**
     * Getter method for returning a specific game based on an ID.
     *
     * @param id The unique id for the game in the database
     * @return game The game that corresponds with the unique id.
     */

    public Game get(int id) {
        return null;
    }

    /**
     * An update method for modifying game values.
     *
     * @param game The game object to be modified.
     */

    public void update(Game game) {

    } // update

    /**
     * A deletion method for removing a game object from the database.
     *
     * @param id The specific id for the game object to be returned.
     */

    public void delete(int id) {

    } // delete

} // GameDAO
