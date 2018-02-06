package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String navigator() {
        return "index";
    }
    /*@RequestMapping("/index")
    public String index() {
        return "index";}*/

    @RequestMapping("/injera")
    public String injera() {
        return "injera";
    }
    @RequestMapping("/crabby")
    public String crabbby() {
        return "crabby";
    }
}
