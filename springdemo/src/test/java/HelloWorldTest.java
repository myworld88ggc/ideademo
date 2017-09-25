import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.management.counter.Variability;
//import org.joda.time.DateTime;
public class HelloWorldTest {

    /** 获得流程引擎 */

    ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();;

    @Test
    public void testFlow() {

        System.out.println("***************Start Report Deploy******************");

        //设置参数
        Map<String, Object> startVariable = new HashMap<String, Object>();
        startVariable.put("ProjectManger", "Kermit");
        startVariable.put("AreaProjectManger", "WillGao");
        startVariable.put("StartDate", "2017-03-09");


        //启动流程
        String processDefinitionKey = "process";// 流程定义的key,也就是bpmn中存在的ID
        ProcessInstance pi = processEngine.getRuntimeService()// 管理流程实例和执行对象，也就是表示正在执行的操作
                .startProcessInstanceByKey(processDefinitionKey, startVariable);//// 按照流程定义的key启动流程实例

        //输出流程实例属性
        System.out.println("流程实例ID：" + pi.getId());// 流程实例ID：101
        System.out.println("流程实例ID：" + pi.getProcessInstanceId());// 流程实例ID：101
        System.out.println("流程实例ID:" + pi.getProcessDefinitionId());// myMyHelloWorld:1:4

        System.out.println("***************开工报告审批******************");


        List<Task> tasks = processEngine.getTaskService()// 与任务相关的Service
                .createTaskQuery()// 创建一个任务查询对象
                .processInstanceId(pi.getId()).list();


        assertEquals(tasks.size(),1);
        if (tasks != null && tasks.size() > 0) {
            for (Task task : tasks) {
                ShowTaskInfo(task);
            }
        }
        //设置变量，完成开工报告审批，审批结果设置为False
        String taskID = tasks.get(0).getId();
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("ApproveResult", "false");
        processEngine.getTaskService().complete(taskID, variables);


        System.out.println("***************开工报告修改******************");

        Task updateStartReportTask = processEngine.getTaskService()// 与任务相关的Service
                .createTaskQuery()// 创建一个任务查询对象
                .processInstanceId(pi.getId())
                .singleResult();

        ShowTaskInfo(updateStartReportTask);
        variables.clear();
        variables.put("StartDate", "2017-03-09");

        processEngine.getTaskService().complete(updateStartReportTask.getId(), variables);

        System.out.println("***************区域领导再次审批******************");

        Task areaProjectManagerTask = processEngine.getTaskService()// 与任务相关的Service
                .createTaskQuery()// 创建一个任务查询对象
                .processInstanceId(pi.getId())
                .singleResult();

        ShowTaskInfo(areaProjectManagerTask);
        variables.clear();
        variables.put("ApproveResult", "true");


        processEngine.getTaskService().complete(areaProjectManagerTask.getId(), variables);


        System.out.println("*************** 流程结束 *****************");

        tasks = processEngine.getTaskService()// 与任务相关的Service
                .createTaskQuery()// 创建一个任务查询对象
                .processInstanceId(pi.getId()).list();

        assertEquals(0, tasks.size());

    }




    private void ShowTaskInfo(Task task) {
        System.out.println("#####################################");
        // task.setAssignee("Kermit");
        System.out.println("任务ID:" + task.getId());
        System.out.println("任务的办理人:" + task.getAssignee());
        System.out.println("任务名称:" + task.getName());
        System.out.println("任务的创建时间:" + task.getCreateTime());
        System.out.println("任务ID:" + task.getId());
        System.out.println("流程实例ID:" + task.getProcessInstanceId());
        System.out.println("#####################################");
    }




}