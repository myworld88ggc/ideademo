package com.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Will on 2017/9/11.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public  String index(){
        return "index";
    }
}
