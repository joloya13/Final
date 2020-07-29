package web.dao;

/************************************************************************************
 * @file PubDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/************************************************************************************
 * This class functions as a handler method for the publisher table in mydb.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class PubDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    /**
     * A getter method for returning a specific Publisher based on their id.
     *
     * @param id The unique id of a publisher.
     * @return The publisher belonging to the id, if it exists.
     */

    public Publisher getPublisher(int id) {
        String q = "Select name from publisher where publisherId  = ?"; //String query

        return  (Publisher) jdbcTemplate.query(q,new Object[]{id}, BeanPropertyRowMapper.newInstance(Publisher.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage
    } // getPublisher
} // PubDAO
