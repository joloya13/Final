package web.controller;

/************************************************************************************
 * @file HomeController.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.dao.ConsoleDAO;
import web.dao.GenreDAO;
import web.model.Game;
import web.dao.GameDAO;
import web.model.GenreConsole;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
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

    @RequestMapping("/search")
    public String search(Model model){
        model.addAttribute("consoles", consoleDAO.list());
        model.addAttribute("genres",genreDAO.list());
        model.addAttribute("genreConsole", new GenreConsole());
        return "search";
    } // search

    /**
     * This method is connected to search above. Search will obtain the queries from the user
     * and pass them to recommendation, which will then produce a 'recommend' page that
     * displays the results.
     *
     * @param genreConsole An object that contains the information stored gathered from the user.
     * @param model Object that passes the data to the controller and database.
     * @return "recommend" The name of the page that contains the results for the query
     */

    @RequestMapping("/recommend")
    public String recommendation(@ModelAttribute("genreConsole") GenreConsole genreConsole, Model model){
            // System.out.println(genreConsole.getConsole());
            model.addAttribute("games", gameDAO.list(genreConsole));
            model.addAttribute("genre", genreDAO.getGenre(genreConsole.getGenre()));
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
