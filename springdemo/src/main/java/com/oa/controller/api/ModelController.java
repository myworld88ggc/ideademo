package com.oa.controller.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.oa.pojo.ActModelQueryParam;
import com.oa.pojo.MessageResult;
import com.oa.pojo.Page;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.util.json.JSONObject;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ModelQuery;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("api/model")
public class ModelController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public MessageResult list(@RequestBody ActModelQueryParam param) {
        MessageResult result = new MessageResult();
        result.setCode(200);
        result.setMsg("Success");

//        ActModelQueryParam param =new ActModelQueryParam();
        String catagory = param.getCategory() == null ? "" : param.getCategory();
        int pageindex = param.getPageIndex() == 0 ? 1 : param.getPageIndex();
        int pagesize = param.getPageSize() == 0 ? 10 : param.getPageSize();

        //根据pageindex,pagesize计算获取数据的区间
        int beginIndex = (pageindex - 1) * pagesize;
        int endIndex = pageindex * pagesize;
        long count = 0;

        //创建Model查询
        ModelQuery modelQuery;

        if (catagory.isEmpty()) {
            modelQuery = repositoryService.createModelQuery();
        } else {
            modelQuery = repositoryService.createModelQuery().modelCategory(catagory);
        }

        count = modelQuery.count();

        //查询数据
        List<Model> listModeList = modelQuery.listPage(beginIndex, pagesize);
        Page<Model> pageData = new Page<Model>(pageindex, pagesize, count, listModeList);

        result.setData(pageData);
        return result;

    }

    @RequestMapping(value="/create", method = RequestMethod.POST)

//    public Object create( @RequestParam Map<String, Object> paramMap) {
        public Object create(@ResponseBody JSONObject jsonObject) {

        MessageResult result = new MessageResult();


        String name = "TEST01";
        String description = "Description";
        String key = "HelloWorld";

//            ObjectMapper objectMapper = new ObjectMapper();
//            ObjectNode modelObjectNode = objectMapper.createObjectNode();
//            modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, name);
//            modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
//            modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, StringUtils.defaultString(description));
//
//            Model newModel = repositoryService.newModel();
//            newModel.setMetaInfo(modelObjectNode.toString());
//            newModel.setName(name);
//            newModel.setKey(StringUtils.defaultString(key));
//            repositoryService.saveModel(newModel);
//
//            ObjectNode editorNode = objectMapper.createObjectNode();
//            editorNode.put("id", "canvas");
//            editorNode.put("resourceId", "canvas");
//
//            ObjectNode stencilSetNode = objectMapper.createObjectNode();
//            stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
//
//            editorNode.put("stencilset", stencilSetNode);
//
//            // 为模型绑定参数
//            repositoryService.addModelEditorSource(newModel.getId(), editorNode.toString().getBytes("utf-8"));

        return result;


    }

}
