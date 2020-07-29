package web.dao;

/************************************************************************************
 * @file ConsoleDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * The class will handle getting and returning information from the SQL database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class ConsoleDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    /**
     * A method to return the specific console from mydb.
     *
     * @param consoleName The specific name of the console to be passed into the method.
     * @return jdbcTemplate.query The results of quering the database.
     */

    public Console getConsole(String consoleName) {
        String q = "Select name from console where consoleName  = ?"; //String query

        return  (Console) jdbcTemplate.query(q,new Object[]{consoleName}, BeanPropertyRowMapper.newInstance(Console.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage
    }// getConsole

    /**
     * A method to return a list of all consoles stored on the DB.
     *
     * @return list A list containing the consoles.
     */

    public List<Console> list(){
        String q = "Select * from console"; //String query

        List<Console> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Console.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }// list
}// Console DAO
