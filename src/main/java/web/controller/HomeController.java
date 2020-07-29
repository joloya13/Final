package web.controller;

/************************************************************************************
 * @file HomeController.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

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

/************************************************************************************
 * Handles the creation of the individual URLs for localhost.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

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

    /**
     * This method maps to the html page.
     *
     * @return "index" A string to be matched with the html.
     */

    @RequestMapping("/")
    public String index(){
        return "index";
    } // index

    /**
     * Maps the login page to the html.
     *
     * @return "index" A string to be matched with the html
     * for logging in.
     */

    @RequestMapping("/login")
    public String login(){
        return "index";
    } // login

    /**
     * Maps the recommendation page to the html.
     *
     * @param model Data to be passed into the method with a method object.
     * @return "recommend" A string to be matched with the html
     * for recommendations for the user.
     */

    @RequestMapping("/recommendation")
    public String recommendation(Model model){
        model.addAttribute("console", consoleDAO.list());
        model.addAttribute("genre",genreDAO.list());
        return "recommend";
    }// recommendation

    /**
     * Maps an index of games to the html.
     *
     * @param model Data to be passed into the method with a model object
     * @return "games" A string to be matched with the html
     * for an index of the games.
     */

    @RequestMapping("/game")
    public String game(Model model){
        List<Game> list = gameDAO.list();
        model.addAttribute("list",list); //assigns the list to the model which passes data to the page
        return "games";
    } // game



}// HomeController
