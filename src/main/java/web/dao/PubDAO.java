package web.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class PubDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    public Publisher getPublisher(int id) {
        String q = "Select name from publisher where publisherId  = ?"; //String query

        return  (Publisher) jdbcTemplate.query(q,new Object[]{id}, BeanPropertyRowMapper.newInstance(Publisher.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage
    }
}
