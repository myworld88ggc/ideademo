package com.oa.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Will on 2017/9/20.
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
