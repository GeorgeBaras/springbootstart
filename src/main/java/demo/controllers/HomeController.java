package demo.controllers;

import demo.Constants;
import demo.persistence.User;
import demo.services.EmailService;
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
public class HomeController implements Constants {
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    @RequestMapping(Constants.HOME_URL)
    public String home(){
        return Constants.HOME_VIEW;
    }

    @GetMapping(Constants.GREETING_URL)
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return Constants.GREETING_VIEW;
    }



}
