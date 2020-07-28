package web.dao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Genre;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GenreDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    public Genre getConsole(String genreId) {
        String q = "Select name from console where consoleName  = ?"; //String query

        return  (Genre) jdbcTemplate.query(q,new Object[]{genreId}, BeanPropertyRowMapper.newInstance(Genre.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage
    }

    public List<Genre> list(){
        String q = "Select * from console"; //String query

        List<Genre> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Genre.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }
}
