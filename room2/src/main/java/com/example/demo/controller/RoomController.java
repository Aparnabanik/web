package com.example.demo.controller;

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/rooms")
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView showAllRoom(){
        ModelAndView mv=new ModelAndView("room.html");
        List<Room> list=roomService.getAllRooms();
        mv.addObject("rooms",list);
        mv.setViewName("room");
        return mv;
    }
    @RequestMapping(value = "/addNew",method = RequestMethod.GET)
    public ModelAndView addNewRoom(){
        ModelAndView mv=new ModelAndView("roomForm.html");
        Room room=new Room();
        mv.addObject("room",room);
        mv.setViewName("roomForm");
        return mv;
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ModelAndView saveRoom(@ModelAttribute("room") Room room){
        System.out.println(room.toString());
        roomService.saveOrUpdate(room);
        return new ModelAndView("redirect:/rooms");
    }
    @RequestMapping(value = "/edit/{roomNo}",method = RequestMethod.GET)
    public ModelAndView updateRoom(@PathVariable("roomNo") String roomN){
        ModelAndView mv=new ModelAndView("roomForm.html");
        Room room=roomService.getRoomById(roomN);
        mv.addObject(room);
        mv.setViewName("roomForm");
        roomService.removeRoom(roomN);
        return mv;
    }
    @RequestMapping(value = "/remove/{roomNo}",method = RequestMethod.GET)
    public ModelAndView removeroom(@PathVariable("roomNo") String roomN){
        roomService .removeRoom(roomN);
        return new ModelAndView("redirect:/rooms");
    }
}

