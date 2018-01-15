package com.will.pojo;

import java.util.Date;

public class mc_ru_todo {
    private String id;

    private String taskid;

    private String systemcode;

    private String procinstid;

    private String processname;

    private String processcode;

    private String tasktitle;

    private String importantcontent;

    private String summary;

    private Integer taskstate;

    private String createuserid;

    private String createusername;

    private String createuserdepartment;

    private String createuserposition;

    private String approvaluserid;

    private String approvalusername;

    private String approvaluserdepartment;

    private String approvaluserposition;

    private String approvalaction;

    private Date arrivaltime;

    private Date approvaltime;

    private Integer platformtype;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_todo(String id, String taskid, String systemcode, String procinstid, String processname, String processcode, String tasktitle, String importantcontent, String summary, Integer taskstate, String createuserid, String createusername, String createuserdepartment, String createuserposition, String approvaluserid, String approvalusername, String approvaluserdepartment, String approvaluserposition, String approvalaction, Date arrivaltime, Date approvaltime, Integer platformtype, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.taskid = taskid;
        this.systemcode = systemcode;
        this.procinstid = procinstid;
        this.processname = processname;
        this.processcode = processcode;
        this.tasktitle = tasktitle;
        this.importantcontent = importantcontent;
        this.summary = summary;
        this.taskstate = taskstate;
        this.createuserid = createuserid;
        this.createusername = createusername;
        this.createuserdepartment = createuserdepartment;
        this.createuserposition = createuserposition;
        this.approvaluserid = approvaluserid;
        this.approvalusername = approvalusername;
        this.approvaluserdepartment = approvaluserdepartment;
        this.approvaluserposition = approvaluserposition;
        this.approvalaction = approvalaction;
        this.arrivaltime = arrivaltime;
        this.approvaltime = approvaltime;
        this.platformtype = platformtype;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_todo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getSystemcode() {
        return systemcode;
    }

    public void setSystemcode(String systemcode) {
        this.systemcode = systemcode == null ? null : systemcode.trim();
    }

    public String getProcinstid() {
        return procinstid;
    }

    public void setProcinstid(String procinstid) {
        this.procinstid = procinstid == null ? null : procinstid.trim();
    }

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname == null ? null : processname.trim();
    }

    public String getProcesscode() {
        return processcode;
    }

    public void setProcesscode(String processcode) {
        this.processcode = processcode == null ? null : processcode.trim();
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle == null ? null : tasktitle.trim();
    }

    public String getImportantcontent() {
        return importantcontent;
    }

    public void setImportantcontent(String importantcontent) {
        this.importantcontent = importantcontent == null ? null : importantcontent.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(Integer taskstate) {
        this.taskstate = taskstate;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getCreateuserdepartment() {
        return createuserdepartment;
    }

    public void setCreateuserdepartment(String createuserdepartment) {
        this.createuserdepartment = createuserdepartment == null ? null : createuserdepartment.trim();
    }

    public String getCreateuserposition() {
        return createuserposition;
    }

    public void setCreateuserposition(String createuserposition) {
        this.createuserposition = createuserposition == null ? null : createuserposition.trim();
    }

    public String getApprovaluserid() {
        return approvaluserid;
    }

    public void setApprovaluserid(String approvaluserid) {
        this.approvaluserid = approvaluserid == null ? null : approvaluserid.trim();
    }

    public String getApprovalusername() {
        return approvalusername;
    }

    public void setApprovalusername(String approvalusername) {
        this.approvalusername = approvalusername == null ? null : approvalusername.trim();
    }

    public String getApprovaluserdepartment() {
        return approvaluserdepartment;
    }

    public void setApprovaluserdepartment(String approvaluserdepartment) {
        this.approvaluserdepartment = approvaluserdepartment == null ? null : approvaluserdepartment.trim();
    }

    public String getApprovaluserposition() {
        return approvaluserposition;
    }

    public void setApprovaluserposition(String approvaluserposition) {
        this.approvaluserposition = approvaluserposition == null ? null : approvaluserposition.trim();
    }

    public String getApprovalaction() {
        return approvalaction;
    }

    public void setApprovalaction(String approvalaction) {
        this.approvalaction = approvalaction == null ? null : approvalaction.trim();
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Date getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    public Integer getPlatformtype() {
        return platformtype;
    }

    public void setPlatformtype(Integer platformtype) {
        this.platformtype = platformtype;
    }

    public Integer getRecordstatus() {
        return recordstatus;
    }

    public void setRecordstatus(Integer recordstatus) {
        this.recordstatus = recordstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }
}