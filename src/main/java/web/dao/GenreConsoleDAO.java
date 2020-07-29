package web.dao;

/************************************************************************************
 * @file GenreDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Genre;

import java.net.Authenticator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.GenreConsole;

/************************************************************************************
 * This class functions as a handler for the `Genre` table in the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class GenreConsoleDAO {


    private JdbcTemplate jdbcTemplate;

    public GenreConsoleDAO() {
    }

    public List<GenreConsole> list(){
        String q = "Select Game_gameId from port where"; //String query

        List<GenreConsole> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(GenreConsole.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }
}
