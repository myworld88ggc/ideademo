package com.will.pojo;

import java.util.Date;

public class mc_se_admin {
    private Integer id;

    private String username;

    private String userid;

    private String roletype;

    private Integer status;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_se_admin(Integer id, String username, String userid, String roletype, Integer status, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.username = username;
        this.userid = userid;
        this.roletype = roletype;
        this.status = status;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_se_admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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