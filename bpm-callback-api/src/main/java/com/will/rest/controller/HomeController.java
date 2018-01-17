package com.will.rest.controller;

import com.will.rest.pojo.MessageResult;
import com.will.rest.sysconst.ReturnTypeCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gao.guangcai on 2018-01-17.
 */
@RestController
@RequestMapping("/rest/home/")
public class HomeController {

    @RequestMapping(value="index", method = {RequestMethod.POST})
    public Object index() {
        MessageResult messageResult = new MessageResult();
        messageResult.setCode(ReturnTypeCode.SUCCESS);
        messageResult.setMsg("回调成功");
        return messageResult;
    }
}
