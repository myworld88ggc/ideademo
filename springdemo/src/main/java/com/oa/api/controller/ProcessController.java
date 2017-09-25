package com.oa.api.controller;

import com.oa.api.pojo.ActProcessModel;
import com.oa.api.pojo.ActProcessQueryParam;
import com.oa.api.pojo.MessageResult;
import com.oa.api.pojo.Page;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Will on 2017/9/24.
 */
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private RepositoryService repositoryService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public MessageResult list(@RequestBody ActProcessQueryParam param) {
        MessageResult result = new MessageResult();
        result.setCode(200);
        result.setMsg("Success");

//        ActModelQueryParam param =new ActModelQueryParam();
        String category = param.getCategory() == null ? "" : param.getCategory();
        int pageindex = param.getPageIndex() == 0 ? 1 : param.getPageIndex();
        int pagesize = param.getPageSize() == 0 ? 10 : param.getPageSize();

        //根据pageindex,pagesize计算获取数据的区间
        int beginIndex = (pageindex - 1) * pagesize;
        int endIndex = pageindex * pagesize;
        long count = 0;

        //创建Model查询
        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery()
                .latestVersion().orderByProcessDefinitionKey().asc();

        if (!category.trim().equals("")) {
            processDefinitionQuery.processDefinitionCategory(category);
        }

        count = processDefinitionQuery.count();
        //查询数据S
        List<ProcessDefinition> listProcessDefinition = processDefinitionQuery.listPage(beginIndex, pagesize);
        Page<ActProcessModel> pageData = new Page<ActProcessModel>(pageindex, pagesize, count);


        for (ProcessDefinition processDefinition : listProcessDefinition) {
            String deploymentId = processDefinition.getDeploymentId();
            Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(deploymentId).singleResult();
            ActProcessModel model=new ActProcessModel();
            model.setId(processDefinition.getId());
            model.setKey(processDefinition.getKey());
            model.setName(processDefinition.getName());
            model.setVersion(processDefinition.getVersion());
            model.setDeploymentTime(deployment.getDeploymentTime());
            model.setSuspended(processDefinition.isSuspended());
            pageData.getList().add(model);
        }

        result.setData(pageData);
        return result;
    }


}
