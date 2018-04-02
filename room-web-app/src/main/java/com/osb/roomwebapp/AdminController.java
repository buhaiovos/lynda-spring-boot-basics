package com.osb.roomwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/login")
    public String getLogginPage() {
        return "login";
    }
}
