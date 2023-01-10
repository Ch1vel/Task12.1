package com.example.Task12.controlles;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String userList() {
        return "admin";
    }
}
