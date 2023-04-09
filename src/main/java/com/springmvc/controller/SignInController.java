package com.springmvc.controller;

import com.springmvc.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignInController {
    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model model){
        model.addAttribute("Author","Praveen Reddy");
        model.addAttribute("CodeIn"," In Intellij idea");
        System.out.println("Adding common data to model");
    }

    //    Process Controller
    @RequestMapping(path = "/signin")
    public String showFrom(Model model){
        System.out.println("Creating Form!!!");

//        model.addAttribute("Author","Praveen Reddy");
//        model.addAttribute("CodeIn"," In Intellij idea");

        return "signin";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleFrom(@ModelAttribute User user, Model model){

//        if (user.getUserName().isEmpty() && user.getUserEmail().isEmpty() || user.getUserPassword().isEmpty()){
//            return "signin";
//        }

        if (user.getUserName().isBlank()){
              return "redirect:/signin";
        }

        model.addAttribute("user",user);

//        model.addAttribute("Author","Praveen Reddy");
//        model.addAttribute("CodeIn"," In Intellij idea");
        this.userService.createUser(user);
        System.out.println(user);

        return "success";
    }






/**  Handler Controller which will specify the final destination of signup.jsp
 @RequestMapping(path = "/formprocess", method = RequestMethod.POST)
 public String handleForm(@RequestParam("name") String userName,
 @RequestParam("email") String userEmail,
 @RequestParam("password") String userPassword, Model model)
 {

 System.out.println("User Name Is: "+userName);
 System.out.println("User Email Is: "+userEmail);
 System.out.println("User password Is: "+userPassword);

 model.addAttribute("name",userName);
 model.addAttribute("email",userEmail);
 model.addAttribute("password",userPassword);


 return"success";
 }*/
}
