package com.will.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gao.guangcai on 2017-10-27.
 */
@RestController
@RequestMapping("/api/user/")
public class UserApiController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}
