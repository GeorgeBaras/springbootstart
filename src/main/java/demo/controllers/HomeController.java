package demo.controllers;

import demo.persistence.User;
import demo.services.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.MessagingException;

@Controller
public class HomeController {
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(){
        User testUser = new User();
        testUser.setUsername("test");
        testUser.setPassword("pass");
        userService.saveUser(testUser);
        return "home";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }



}
