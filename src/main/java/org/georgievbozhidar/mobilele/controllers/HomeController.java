package org.georgievbozhidar.mobilele.controllers;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    Gson gson = new Gson();

    public HomeController(Gson gson) {
        this.gson = gson;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
