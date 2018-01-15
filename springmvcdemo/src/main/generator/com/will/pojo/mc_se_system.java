package com.will.pojo;

import java.util.Date;

public class mc_se_system {
    private Integer id;

    private String sysname;

    private String syscode;

    private String syskey;

    private String sysPermission;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_se_system(Integer id, String sysname, String syscode, String syskey, String sysPermission, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.sysname = sysname;
        this.syscode = syscode;
        this.syskey = syskey;
        this.sysPermission = sysPermission;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_se_system() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    public String getSyskey() {
        return syskey;
    }

    public void setSyskey(String syskey) {
        this.syskey = syskey == null ? null : syskey.trim();
    }

    public String getSysPermission() {
        return sysPermission;
    }

    public void setSysPermission(String sysPermission) {
        this.sysPermission = sysPermission == null ? null : sysPermission.trim();
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