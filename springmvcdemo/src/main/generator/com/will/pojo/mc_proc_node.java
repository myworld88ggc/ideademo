package com.will.pojo;

import java.util.Date;

public class mc_proc_node {
    private String id;

    private String proccode;

    private String procversion;

    private String nodeid;

    private String nodename;

    private String findusertype;

    private String finduserparam;

    private String approvalaction;

    private Boolean autoapproval;

    private Boolean ismobile;

    private Boolean isbatch;

    private Boolean isactivie;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_proc_node(String id, String proccode, String procversion, String nodeid, String nodename, String findusertype, String finduserparam, String approvalaction, Boolean autoapproval, Boolean ismobile, Boolean isbatch, Boolean isactivie, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.proccode = proccode;
        this.procversion = procversion;
        this.nodeid = nodeid;
        this.nodename = nodename;
        this.findusertype = findusertype;
        this.finduserparam = finduserparam;
        this.approvalaction = approvalaction;
        this.autoapproval = autoapproval;
        this.ismobile = ismobile;
        this.isbatch = isbatch;
        this.isactivie = isactivie;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_proc_node() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProccode() {
        return proccode;
    }

    public void setProccode(String proccode) {
        this.proccode = proccode == null ? null : proccode.trim();
    }

    public String getProcversion() {
        return procversion;
    }

    public void setProcversion(String procversion) {
        this.procversion = procversion == null ? null : procversion.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getFindusertype() {
        return findusertype;
    }

    public void setFindusertype(String findusertype) {
        this.findusertype = findusertype == null ? null : findusertype.trim();
    }

    public String getFinduserparam() {
        return finduserparam;
    }

    public void setFinduserparam(String finduserparam) {
        this.finduserparam = finduserparam == null ? null : finduserparam.trim();
    }

    public String getApprovalaction() {
        return approvalaction;
    }

    public void setApprovalaction(String approvalaction) {
        this.approvalaction = approvalaction == null ? null : approvalaction.trim();
    }

    public Boolean getAutoapproval() {
        return autoapproval;
    }

    public void setAutoapproval(Boolean autoapproval) {
        this.autoapproval = autoapproval;
    }

    public Boolean getIsmobile() {
        return ismobile;
    }

    public void setIsmobile(Boolean ismobile) {
        this.ismobile = ismobile;
    }

    public Boolean getIsbatch() {
        return isbatch;
    }

    public void setIsbatch(Boolean isbatch) {
        this.isbatch = isbatch;
    }

    public Boolean getIsactivie() {
        return isactivie;
    }

    public void setIsactivie(Boolean isactivie) {
        this.isactivie = isactivie;
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