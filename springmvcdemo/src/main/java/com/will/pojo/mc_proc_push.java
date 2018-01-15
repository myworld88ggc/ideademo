package com.will.pojo;

import java.util.Date;

public class mc_proc_push {
    private String id;

    private String proccode;

    private String rejectpush;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_proc_push(String id, String proccode, String rejectpush, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.proccode = proccode;
        this.rejectpush = rejectpush;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_proc_push() {
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

    public String getRejectpush() {
        return rejectpush;
    }

    public void setRejectpush(String rejectpush) {
        this.rejectpush = rejectpush == null ? null : rejectpush.trim();
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