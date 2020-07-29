package web.dao;

/************************************************************************************
 * @file GenreDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Genre;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/************************************************************************************
 * This class functions as a handler for the `Genre` table in the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class GenreDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    /**
     * A getter method for returning a specific genre.
     *
     * @param genreId The unique id for the genre.
     * @return jdbcTemplate.query The console from the table, if it exists.
     */

    public List<Genre> getGenre(int genreId) {
        String q = "Select * from genre where genreId  = ?"; //String query

        return jdbcTemplate.query(q,new Object[]{genreId}, BeanPropertyRowMapper.newInstance(Genre.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage
    } // getConsole

    /**
     * A getter method to return the list of consoles in the table.
     *
     * @return list A comprehensive list of consoles.
     */

    public List<Genre> list(){
        String q = "Select * from genre"; //String query

        List<Genre> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Genre.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    } // list
} // GenreDAO
