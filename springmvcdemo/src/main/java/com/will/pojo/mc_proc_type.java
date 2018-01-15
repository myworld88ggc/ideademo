package com.will.pojo;

import java.util.Date;

public class mc_proc_type {
    private String id;

    private String typecode;

    private String typename;

    private String parenttypecode;

    private String fullpathcode;

    private Integer typeorder;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_proc_type(String id, String typecode, String typename, String parenttypecode, String fullpathcode, Integer typeorder, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.typecode = typecode;
        this.typename = typename;
        this.parenttypecode = parenttypecode;
        this.fullpathcode = fullpathcode;
        this.typeorder = typeorder;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_proc_type() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getParenttypecode() {
        return parenttypecode;
    }

    public void setParenttypecode(String parenttypecode) {
        this.parenttypecode = parenttypecode == null ? null : parenttypecode.trim();
    }

    public String getFullpathcode() {
        return fullpathcode;
    }

    public void setFullpathcode(String fullpathcode) {
        this.fullpathcode = fullpathcode == null ? null : fullpathcode.trim();
    }

    public Integer getTypeorder() {
        return typeorder;
    }

    public void setTypeorder(Integer typeorder) {
        this.typeorder = typeorder;
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