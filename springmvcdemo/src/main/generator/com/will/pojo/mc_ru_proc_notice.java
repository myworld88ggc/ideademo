package com.will.pojo;

import java.util.Date;

public class mc_ru_proc_notice {
    private Long id;

    private String procinstid;

    private String noticeuserid;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_proc_notice(Long id, String procinstid, String noticeuserid, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.procinstid = procinstid;
        this.noticeuserid = noticeuserid;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_proc_notice() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcinstid() {
        return procinstid;
    }

    public void setProcinstid(String procinstid) {
        this.procinstid = procinstid == null ? null : procinstid.trim();
    }

    public String getNoticeuserid() {
        return noticeuserid;
    }

    public void setNoticeuserid(String noticeuserid) {
        this.noticeuserid = noticeuserid == null ? null : noticeuserid.trim();
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