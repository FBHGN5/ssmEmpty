package com.shop.web;


import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String dd(){
        userService.login();
        return "index";
    }
}
