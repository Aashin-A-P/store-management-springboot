package com.aashinspringboot.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        //return "index.html";
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName(){
        return "index";
    }
}
