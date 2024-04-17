package ca.tlcp.educate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping(path = "/home")
    public ModelAndView studentDash() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

}
