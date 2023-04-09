package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {


// Example of redirectView :

//    @RequestMapping(path = "/one")
//    public String methodOne(){
//        System.out.println("This is MethodOne");
//        return "redirect:/two";
//    }
           @RequestMapping(path = "/one")
           public RedirectView methodOne(){
              System.out.println("This is MethodOne");
              RedirectView redirectView = new RedirectView();
              redirectView.setUrl("two");//Relative URL//redirectView.setUrl("https://www.github.com");
               return redirectView;
            }

    @RequestMapping(path = "/two")
    public String methodTwo(){
        System.out.println("This is MethodTwo");
        return "signin";
    }
}
