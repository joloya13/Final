package web.dao;

/************************************************************************************
 * @file GameDAO.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import web.model.Console;
import web.model.Game;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.GenreConsole;
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
        int min = 10;

        int num = (int)(Math.random()*((max-min)+1))+min;
        String query = "INSERT INTO `user` (`userId`,`userName`,`Genre_genreId`,`password`) VALUES (?,?,?,?)";

        return jdbcTemplate.update(query,num,user.getUserName(),user.getGenre_genreId(),user.getPassword());
    }

    public int findUser(User user){
        String q = "Select * from user where userName  = ?"; //String query

        List<User> f =  jdbcTemplate.query(q,new Object[]{user.getUserName()}, BeanPropertyRowMapper.newInstance(User.class));

        if(f.size() == 0) return 0;

        User s = f.get(0);

        System.out.println(s.getPassword());

        if(s == null) return 0;
        System.out.println("past null");
        if(user.getPassword().equals(s.getPassword())){
            return 1;
        }
        System.out.println("password didnt match");
        return 0;
    }

}
