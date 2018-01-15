package com.will.pojo;

import java.util.Date;

public class mc_com_group_member {
    private String id;

    private String groupcode;

    private String username;

    private String userid;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_com_group_member(String id, String groupcode, String username, String userid, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.groupcode = groupcode;
        this.username = username;
        this.userid = userid;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_com_group_member() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
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