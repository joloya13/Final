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
import web.model.Publisher;
import web.model.User;

/************************************************************************************
 * This class will function as a handler for the `Game` table in the database. It functions as a getter,
 * setter, and modifier.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

@Repository
@Transactional
public class UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int InsertUser(User user){
        int max = 255;
        int min = 1;

        int num = (int)(Math.random()*((max-min)+1))+min;
        String query = "INSERT INTO `user` (`userId`,`userName`,`Genre_genreId`,`password`,`role`,`enabled`) VALUES (?,?,?,?,?,?)";

        return jdbcTemplate.update(query,num,user.getUserName(),user.getGenre_genreId(),user.getPassword(),"ROLE_USER",1);
    }

    public User findUser(User user){
        String query = "Select * from 'user' where userName = ?";

        return  (User) jdbcTemplate.query(query,new Object[]{user.getUserName()}, BeanPropertyRowMapper.newInstance(Publisher.class)); //jdbctemplate maps the result and stores a class as a bean which can be accessed by the webpage

    }
}
