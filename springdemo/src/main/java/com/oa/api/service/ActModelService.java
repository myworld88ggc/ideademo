package com.oa.api.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.ActivitiException;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

/**
 * Created by Will on 2017/9/24.
 */
@Service
public class ActModelService {
    @Autowired
    private RepositoryService repositoryService;

    public String deploy(String id) {
        String message = "";
        try {
            org.activiti.engine.repository.Model modelData = repositoryService.getModel(id);
            BpmnJsonConverter jsonConverter = new BpmnJsonConverter();
            JsonNode editorNode = new ObjectMapper().readTree(repositoryService.getModelEditorSource(modelData.getId()));
            BpmnModel bpmnModel = jsonConverter.convertToBpmnModel(editorNode);
            BpmnXMLConverter xmlConverter = new BpmnXMLConverter();
            byte[] bpmnBytes = xmlConverter.convertToXML(bpmnModel);

            String processName = modelData.getName();
            if (!processName.endsWith(".bpmn20.xml")) {
                processName += ".bpmn20.xml";
            }
//			System.out.println("========="+processName+"============"+modelData.getName());
            ByteArrayInputStream in = new ByteArrayInputStream(bpmnBytes);
            Deployment deployment = repositoryService.createDeployment().name(modelData.getName())
                    .addInputStream(processName, in).deploy();
//					.addString(processName, new String(bpmnBytes)).deploy();

            // 设置流程分类
            List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).list();
            for (ProcessDefinition processDefinition : list) {
                repositoryService.setProcessDefinitionCategory(processDefinition.getId(), modelData.getCategory());
                message = "部署成功，流程ID=" + processDefinition.getId();
            }
            if (list.size() == 0) {
                message = "部署失败，没有流程。";
            }
        } catch (Exception e) {
            throw new ActivitiException("设计模型图不正确，检查模型正确性，模型ID=" + id, e);
        }
        return message;
    }

}
