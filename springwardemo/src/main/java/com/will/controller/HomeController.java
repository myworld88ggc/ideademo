package com.will.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gao.guangcai on 2017-09-12.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String Index(){
        return "Index";
    }
}
