package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.WebApplication;
import web.dao.ConsoleDAO;
import web.dao.GenreDAO;
import web.model.Game;
import web.dao.GameDAO;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private GameDAO gameDAO;
    @Autowired
    private ConsoleDAO consoleDAO;
    @Autowired
    private GenreDAO genreDAO;

//    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    @RequestMapping("/recommendation")
    public String recommendation(Model model){
        model.addAttribute("console", consoleDAO.list());
        model.addAttribute("genre",genreDAO.list());
        return "recommend";
    }

    /**
     *
     * @param model - passing in data through through the model object
     * @return String - name of the template html page
     */
    @RequestMapping("/game")
    public String game(Model model){
        List<Game> list = gameDAO.list();
        model.addAttribute("list",list); //assigns the list to the model which passes data to the page
        return "games";
    }



}
