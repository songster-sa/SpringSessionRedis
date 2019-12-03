package com.expore.spring.springsession.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

    @GetMapping("/")
    public String createSession(Model model, HttpSession session) {
        model.addAttribute("sessionMessages", new ArrayList<>());
        model.addAttribute("sessionid", "");
        return "index";
    }

    @PostMapping("/save")
    public String saveSession(@RequestParam("msg") String msg, HttpServletRequest request) {
        return null;
    }

    @PostMapping("/destroy")
    public String destroySession(HttpServletRequest request) {
        return null;
    }
}