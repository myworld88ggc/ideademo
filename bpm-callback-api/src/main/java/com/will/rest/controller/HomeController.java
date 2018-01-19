package com.will.rest.controller;

import com.will.rest.pojo.MessageResult;
import com.will.rest.sysconst.ReturnTypeCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by gao.guangcai on 2018-01-17.
 */
@RestController
@RequestMapping("/rest/home/")
public class HomeController {

    @RequestMapping(value="index", method = {RequestMethod.POST})
    public Object index(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String AAA) throws IOException {
        printRequestParams(request);

        InputStream stream= request.getInputStream();
        if (stream != null) {
            StringBuffer xmlStringBuffer = new StringBuffer();
            byte[] byteCopy = new byte[1024];
            for (int n; (n = stream.read(byteCopy)) != -1; ) {
                xmlStringBuffer.append(new String(byteCopy, 0, n));
            }
            String xmlData= xmlStringBuffer.toString();
            System.out.println(xmlData);
        }

        MessageResult messageResult = new MessageResult();
        messageResult.setCode(ReturnTypeCode.SUCCESS);
        messageResult.setMsg("回调成功");
        return messageResult;
    }


    private void printRequestParams(HttpServletRequest request) {
        Map<String, String[]> param= request.getParameterMap();
        for (Map.Entry<String, String[]> entry : param.entrySet()) {
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Param: " +entry.getKey());
            for (String value : entry.getValue()) {
                System.out.println(value);
            }
            System.out.println("+++++++++++++++++++++++");
        }
    }
}
