package org.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/online")
    public String online(){
        return "online";
    }

//    @RequestMapping("/detail3")
//    public String detail3(){
//        return "/problem-detail3";
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
