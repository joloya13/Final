package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.WebApplication;
import web.model.Game;
import web.dao.GameDAO;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private GameDAO gameDAO;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String get(){
        return "index";
    }

    /**
     *
     * @param model - passing in data through through the model object
     * @return String - name of the template html page
     */
    @RequestMapping("/game")
    public String index(Model model){
        List<Game> list = gameDAO.list();
        logger.debug("worker");
        model.addAttribute("list",list); //assigns the list to the model which passes data to the page
        return "games";
    }



}
