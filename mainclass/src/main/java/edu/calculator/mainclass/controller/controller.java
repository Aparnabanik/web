package edu.calculator.mainclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public ModelAndView Home(){
        ModelAndView modelAndView=new ModelAndView("Home");
       //modelAndView.setViewName("Home");
        return modelAndView;

    }
}
