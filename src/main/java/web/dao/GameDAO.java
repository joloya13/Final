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
    private JdbcTemplate jdbcTemplate;

    public List<Game> list(){
        String q = "Select * from game limit 20";

        List<Game> list = jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Game.class));

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
