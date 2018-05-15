package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {
    @RequestMapping(name = "/main", method = RequestMethod.GET)
    public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("main");

        return mav;
    }
}
