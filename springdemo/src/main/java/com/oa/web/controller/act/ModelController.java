package com.oa.web.controller.act;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("model")
public class ModelController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("/model/list");
        return mav;
    }

}
