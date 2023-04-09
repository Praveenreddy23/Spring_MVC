package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/control", method = RequestMethod.POST)
public class HomeController {

    @RequestMapping(path = "/contact")
    public String contact(Model model){
        System.out.println("Hello Contact");

        model.addAttribute("name","Praveen Reddy");
        model.addAttribute("no",8123339);

        List<String> friends = new ArrayList<>();
        friends.add("reddy");
        friends.add("Da");
        friends.add("Di");

        model.addAttribute("frnd",friends);

        return"index";
    }

    @RequestMapping(path = "/view")
    public ModelAndView about(){
        System.out.println("About page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Reddy");
        modelAndView.addObject("id",23);

        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(23);
        list1.add(25);
        list1.add(24);

        modelAndView.addObject("marks",list1);

        modelAndView.setViewName("about");

        return modelAndView;
    }
}
