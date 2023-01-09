package org.example.pp.controller;

import org.example.pp.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String showUserDetails(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user);
        return "userDetails";
    }
}
