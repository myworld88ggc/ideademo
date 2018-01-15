package com.will.pojo;

import java.util.Date;

public class mc_ru_procinst {
    private String id;

    private String procinstid;

    private String systemcode;

    private String processname;

    private String processcode;

    private String procinsttitle;

    private String importantcontent;

    private String summary;

    private Integer processstate;

    private String processstatetext;

    private Date starttime;

    private Date endtime;

    private String createuserid;

    private String createusername;

    private String createuserdepartment;

    private String createuserposition;

    private String applyuserid;

    private String applyusername;

    private String applyuserdepartment;

    private String applyuserposition;

    private String cannotreviewapprovalloguserid;

    private Integer platformtype;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_procinst(String id, String procinstid, String systemcode, String processname, String processcode, String procinsttitle, String importantcontent, String summary, Integer processstate, String processstatetext, Date starttime, Date endtime, String createuserid, String createusername, String createuserdepartment, String createuserposition, String applyuserid, String applyusername, String applyuserdepartment, String applyuserposition, String cannotreviewapprovalloguserid, Integer platformtype, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.procinstid = procinstid;
        this.systemcode = systemcode;
        this.processname = processname;
        this.processcode = processcode;
        this.procinsttitle = procinsttitle;
        this.importantcontent = importantcontent;
        this.summary = summary;
        this.processstate = processstate;
        this.processstatetext = processstatetext;
        this.starttime = starttime;
        this.endtime = endtime;
        this.createuserid = createuserid;
        this.createusername = createusername;
        this.createuserdepartment = createuserdepartment;
        this.createuserposition = createuserposition;
        this.applyuserid = applyuserid;
        this.applyusername = applyusername;
        this.applyuserdepartment = applyuserdepartment;
        this.applyuserposition = applyuserposition;
        this.cannotreviewapprovalloguserid = cannotreviewapprovalloguserid;
        this.platformtype = platformtype;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_procinst() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProcinstid() {
        return procinstid;
    }

    public void setProcinstid(String procinstid) {
        this.procinstid = procinstid == null ? null : procinstid.trim();
    }

    public String getSystemcode() {
        return systemcode;
    }

    public void setSystemcode(String systemcode) {
        this.systemcode = systemcode == null ? null : systemcode.trim();
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

    public String getProcinsttitle() {
        return procinsttitle;
    }

    public void setProcinsttitle(String procinsttitle) {
        this.procinsttitle = procinsttitle == null ? null : procinsttitle.trim();
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

    public Integer getProcessstate() {
        return processstate;
    }

    public void setProcessstate(Integer processstate) {
        this.processstate = processstate;
    }

    public String getProcessstatetext() {
        return processstatetext;
    }

    public void setProcessstatetext(String processstatetext) {
        this.processstatetext = processstatetext == null ? null : processstatetext.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public String getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(String applyuserid) {
        this.applyuserid = applyuserid == null ? null : applyuserid.trim();
    }

    public String getApplyusername() {
        return applyusername;
    }

    public void setApplyusername(String applyusername) {
        this.applyusername = applyusername == null ? null : applyusername.trim();
    }

    public String getApplyuserdepartment() {
        return applyuserdepartment;
    }

    public void setApplyuserdepartment(String applyuserdepartment) {
        this.applyuserdepartment = applyuserdepartment == null ? null : applyuserdepartment.trim();
    }

    public String getApplyuserposition() {
        return applyuserposition;
    }

    public void setApplyuserposition(String applyuserposition) {
        this.applyuserposition = applyuserposition == null ? null : applyuserposition.trim();
    }

    public String getCannotreviewapprovalloguserid() {
        return cannotreviewapprovalloguserid;
    }

    public void setCannotreviewapprovalloguserid(String cannotreviewapprovalloguserid) {
        this.cannotreviewapprovalloguserid = cannotreviewapprovalloguserid == null ? null : cannotreviewapprovalloguserid.trim();
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