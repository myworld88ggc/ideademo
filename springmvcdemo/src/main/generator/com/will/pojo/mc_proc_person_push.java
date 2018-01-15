package com.will.pojo;

import java.util.Date;

public class mc_proc_person_push {
    private String id;

    private String userid;

    private String proccode;

    private String rejectpush;

    private Integer recodstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_proc_person_push(String id, String userid, String proccode, String rejectpush, Integer recodstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.userid = userid;
        this.proccode = proccode;
        this.rejectpush = rejectpush;
        this.recodstatus = recodstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_proc_person_push() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getProccode() {
        return proccode;
    }

    public void setProccode(String proccode) {
        this.proccode = proccode == null ? null : proccode.trim();
    }

    public String getRejectpush() {
        return rejectpush;
    }

    public void setRejectpush(String rejectpush) {
        this.rejectpush = rejectpush == null ? null : rejectpush.trim();
    }

    public Integer getRecodstatus() {
        return recodstatus;
    }

    public void setRecodstatus(Integer recodstatus) {
        this.recodstatus = recodstatus;
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