package com.ahmad.cobac.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Site {
    public String home() {
        return "index";
    }
}
