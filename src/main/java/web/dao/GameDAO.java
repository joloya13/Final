package web.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Game;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GameDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate; //this interacts with the database. Autowired makes it static. No need to instantiate

    public List<Game> list(){
        String q = "Select * from game where name like 'c%' limit 50"; //String query

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

        return list;
    }

    public void save(Game game) {

    }

    public Game get(int id) {
        return null;
    }

    public void update(Game game) {
    }

    public void delete(int id) {
    }

}
