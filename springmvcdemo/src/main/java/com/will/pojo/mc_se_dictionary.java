package com.will.pojo;

import java.util.Date;

public class mc_se_dictionary {
    private Long id;

    private String code;

    private String parentcode;

    private String fullpath;

    private Integer dictype;

    private String displayname;

    private String dicvalue;

    private Integer dicorder;

    private String remark;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_se_dictionary(Long id, String code, String parentcode, String fullpath, Integer dictype, String displayname, String dicvalue, Integer dicorder, String remark, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.code = code;
        this.parentcode = parentcode;
        this.fullpath = fullpath;
        this.dictype = dictype;
        this.displayname = displayname;
        this.dicvalue = dicvalue;
        this.dicorder = dicorder;
        this.remark = remark;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_se_dictionary() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode == null ? null : parentcode.trim();
    }

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath == null ? null : fullpath.trim();
    }

    public Integer getDictype() {
        return dictype;
    }

    public void setDictype(Integer dictype) {
        this.dictype = dictype;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    public String getDicvalue() {
        return dicvalue;
    }

    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue == null ? null : dicvalue.trim();
    }

    public Integer getDicorder() {
        return dicorder;
    }

    public void setDicorder(Integer dicorder) {
        this.dicorder = dicorder;
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