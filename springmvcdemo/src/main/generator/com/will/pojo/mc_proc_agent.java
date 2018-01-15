package com.will.pojo;

import java.util.Date;

public class mc_proc_agent {
    private String id;

    private String username;

    private String userid;

    private String agentusername;

    private String agentuserid;

    private String agentproccode;

    private String agenttype;

    private Date begintime;

    private Date endtime;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_proc_agent(String id, String username, String userid, String agentusername, String agentuserid, String agentproccode, String agenttype, Date begintime, Date endtime, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.username = username;
        this.userid = userid;
        this.agentusername = agentusername;
        this.agentuserid = agentuserid;
        this.agentproccode = agentproccode;
        this.agenttype = agenttype;
        this.begintime = begintime;
        this.endtime = endtime;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_proc_agent() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getAgentusername() {
        return agentusername;
    }

    public void setAgentusername(String agentusername) {
        this.agentusername = agentusername == null ? null : agentusername.trim();
    }

    public String getAgentuserid() {
        return agentuserid;
    }

    public void setAgentuserid(String agentuserid) {
        this.agentuserid = agentuserid == null ? null : agentuserid.trim();
    }

    public String getAgentproccode() {
        return agentproccode;
    }

    public void setAgentproccode(String agentproccode) {
        this.agentproccode = agentproccode == null ? null : agentproccode.trim();
    }

    public String getAgenttype() {
        return agenttype;
    }

    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype == null ? null : agenttype.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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