package ca.tlcp.educate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

    @GetMapping(path = "/dashboard")
    public ModelAndView dashbaord() {
        ModelAndView mav = new ModelAndView("dashboard");

        return mav;
    }


}
