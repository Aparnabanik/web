package com.example.demo.controller;

import com.example.demo.model.register;
import com.example.demo.service.registerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class recontroller {
    @Autowired
    private registerservice reservice;

    @RequestMapping("/registers")
    public ModelAndView show()
    {
        ModelAndView mv=new ModelAndView();
        List<register> list=reservice.showall();
        mv.addObject("register",list);
        mv.setViewName("register");
        return mv;

    }

}
