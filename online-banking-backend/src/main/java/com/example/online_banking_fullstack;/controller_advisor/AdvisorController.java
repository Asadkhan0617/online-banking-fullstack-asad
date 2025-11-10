package com.example.online_banking_fullstack.controller_advisor;


import com.example.online_banking_fullstack.models.User;
import org.springframework.web.bind.annotation.ModelAttribute;

public class AdvisorController {

    @ModelAttribute("registerUser")
    public User getUserDefaults(){
        return  new User();
    }
}
