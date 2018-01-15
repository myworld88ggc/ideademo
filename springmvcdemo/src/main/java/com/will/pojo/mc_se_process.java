package com.will.pojo;

import java.util.Date;

public class mc_se_process {
    private Integer id;

    private String systemname;

    private String syscode;

    private String processname;

    private String processcode;

    private Integer processtype;

    private Integer processorder;

    private String summary;

    private String details;

    private String apicallbackhost;

    private String apicallbackpath;

    private Integer platformtype;

    private Date regtime;

    private Integer regstatus;

    private String contactusername;

    private String contactuserid;

    private String currentvalidversion;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_se_process(Integer id, String systemname, String syscode, String processname, String processcode, Integer processtype, Integer processorder, String summary, String details, String apicallbackhost, String apicallbackpath, Integer platformtype, Date regtime, Integer regstatus, String contactusername, String contactuserid, String currentvalidversion, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.systemname = systemname;
        this.syscode = syscode;
        this.processname = processname;
        this.processcode = processcode;
        this.processtype = processtype;
        this.processorder = processorder;
        this.summary = summary;
        this.details = details;
        this.apicallbackhost = apicallbackhost;
        this.apicallbackpath = apicallbackpath;
        this.platformtype = platformtype;
        this.regtime = regtime;
        this.regstatus = regstatus;
        this.contactusername = contactusername;
        this.contactuserid = contactuserid;
        this.currentvalidversion = currentvalidversion;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_se_process() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname == null ? null : processname.trim();
    }

    public String getProcesscode() {
        return processcode;
    }

    public void setProcesscode(String processcode) {
        this.processcode = processcode == null ? null : processcode.trim();
    }

    public Integer getProcesstype() {
        return processtype;
    }

    public void setProcesstype(Integer processtype) {
        this.processtype = processtype;
    }

    public Integer getProcessorder() {
        return processorder;
    }

    public void setProcessorder(Integer processorder) {
        this.processorder = processorder;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getApicallbackhost() {
        return apicallbackhost;
    }

    public void setApicallbackhost(String apicallbackhost) {
        this.apicallbackhost = apicallbackhost == null ? null : apicallbackhost.trim();
    }

    public String getApicallbackpath() {
        return apicallbackpath;
    }

    public void setApicallbackpath(String apicallbackpath) {
        this.apicallbackpath = apicallbackpath == null ? null : apicallbackpath.trim();
    }

    public Integer getPlatformtype() {
        return platformtype;
    }

    public void setPlatformtype(Integer platformtype) {
        this.platformtype = platformtype;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getRegstatus() {
        return regstatus;
    }

    public void setRegstatus(Integer regstatus) {
        this.regstatus = regstatus;
    }

    public String getContactusername() {
        return contactusername;
    }

    public void setContactusername(String contactusername) {
        this.contactusername = contactusername == null ? null : contactusername.trim();
    }

    public String getContactuserid() {
        return contactuserid;
    }

    public void setContactuserid(String contactuserid) {
        this.contactuserid = contactuserid == null ? null : contactuserid.trim();
    }

    public String getCurrentvalidversion() {
        return currentvalidversion;
    }

    public void setCurrentvalidversion(String currentvalidversion) {
        this.currentvalidversion = currentvalidversion == null ? null : currentvalidversion.trim();
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