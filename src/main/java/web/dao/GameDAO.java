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
        String q = "Select * from game where name like 'c%' limit 50"; //String query

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }

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
