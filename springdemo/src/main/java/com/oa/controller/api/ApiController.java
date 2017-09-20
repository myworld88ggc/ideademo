package com.oa.controller.api;

import com.oa.pojo.ApiReturnMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Will on 2017/9/20.
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("index")
    public  Object index(){
        return new ApiReturnMessage(200, "success", "Test");
    }

}
