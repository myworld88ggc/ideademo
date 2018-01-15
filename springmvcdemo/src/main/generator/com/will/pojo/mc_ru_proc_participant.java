package com.will.pojo;

import java.util.Date;

public class mc_ru_proc_participant {
    private Long id;

    private String procinstid;

    private String puserid;

    private Integer ptype;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_proc_participant(Long id, String procinstid, String puserid, Integer ptype, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.procinstid = procinstid;
        this.puserid = puserid;
        this.ptype = ptype;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_proc_participant() {
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

    public String getPuserid() {
        return puserid;
    }

    public void setPuserid(String puserid) {
        this.puserid = puserid == null ? null : puserid.trim();
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
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