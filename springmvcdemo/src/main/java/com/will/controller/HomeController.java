package com.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gao.guangcai on 2017-10-27.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
