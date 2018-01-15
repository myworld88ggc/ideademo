package com.will.pojo;

import java.util.Date;

public class mc_com_group {
    private String id;

    private String groupname;

    private String groupcode;

    private String groupleader;

    private Integer grouptype;

    private String parentgroupcode;

    private String reportpathcode;

    private String reportpathname;

    private String remark;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_com_group(String id, String groupname, String groupcode, String groupleader, Integer grouptype, String parentgroupcode, String reportpathcode, String reportpathname, String remark, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.groupname = groupname;
        this.groupcode = groupcode;
        this.groupleader = groupleader;
        this.grouptype = grouptype;
        this.parentgroupcode = parentgroupcode;
        this.reportpathcode = reportpathcode;
        this.reportpathname = reportpathname;
        this.remark = remark;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_com_group() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
    }

    public String getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(String groupleader) {
        this.groupleader = groupleader == null ? null : groupleader.trim();
    }

    public Integer getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(Integer grouptype) {
        this.grouptype = grouptype;
    }

    public String getParentgroupcode() {
        return parentgroupcode;
    }

    public void setParentgroupcode(String parentgroupcode) {
        this.parentgroupcode = parentgroupcode == null ? null : parentgroupcode.trim();
    }

    public String getReportpathcode() {
        return reportpathcode;
    }

    public void setReportpathcode(String reportpathcode) {
        this.reportpathcode = reportpathcode == null ? null : reportpathcode.trim();
    }

    public String getReportpathname() {
        return reportpathname;
    }

    public void setReportpathname(String reportpathname) {
        this.reportpathname = reportpathname == null ? null : reportpathname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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