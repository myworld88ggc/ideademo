package com.oa.api.service;

import com.oa.api.pojo.Page;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Will on 2017/9/24.
 */
public class ActProcessServices {

    @Autowired
    private RepositoryService repositoryService;
//    @Autowired
//    private RuntimeService runtimeService;

    /**
     * 流程定义列表
     */
    public Page processList(String category) {

//        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery()
//                .latestVersion().orderByProcessDefinitionKey().asc();
//
//
//        page.setCount(processDefinitionQuery.count());
//
//        List<ProcessDefinition> processDefinitionList = processDefinitionQuery.listPage(page.getFirstResult(), page.getMaxResults());
//        for (ProcessDefinition processDefinition : processDefinitionList) {
//            String deploymentId = processDefinition.getDeploymentId();
//            Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(deploymentId).singleResult();
//            page.getList().add(new Object[]{processDefinition, deployment});
//        }
//
        return null;
    }

}
