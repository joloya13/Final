package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestMapping(name = "username",)){
        return "login";
    }

}
