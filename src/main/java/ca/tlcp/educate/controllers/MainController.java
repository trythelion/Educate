package ca.tlcp.educate.controllers;

import ca.tlcp.educate.user.User;
import ca.tlcp.educate.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepo;

    @PostMapping(path = "/signin")
    public RedirectView signin(@RequestParam String username, @RequestParam String passwd) {
        if (username.equals("admin") && passwd.equals("admin")) {
            return new RedirectView("/dashboard");
        } else {
            return new RedirectView("/home");
        }
    }



}
