package com.will.pojo;

import java.util.Date;

public class mc_ru_notice_content {
    private String id;

    private String procinstid;

    private String senduserid;

    private String sendusername;

    private String noticeuserid;

    private String noticeusername;

    private String noticetype;

    private String title;

    private String summary;

    private String noticecontent;

    private String contenttype;

    private String importantflag;

    private Integer noticestatus;

    private Date readtime;

    private Integer readplatformtype;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_notice_content(String id, String procinstid, String senduserid, String sendusername, String noticeuserid, String noticeusername, String noticetype, String title, String summary, String noticecontent, String contenttype, String importantflag, Integer noticestatus, Date readtime, Integer readplatformtype, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.procinstid = procinstid;
        this.senduserid = senduserid;
        this.sendusername = sendusername;
        this.noticeuserid = noticeuserid;
        this.noticeusername = noticeusername;
        this.noticetype = noticetype;
        this.title = title;
        this.summary = summary;
        this.noticecontent = noticecontent;
        this.contenttype = contenttype;
        this.importantflag = importantflag;
        this.noticestatus = noticestatus;
        this.readtime = readtime;
        this.readplatformtype = readplatformtype;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_notice_content() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProcinstid() {
        return procinstid;
    }

    public void setProcinstid(String procinstid) {
        this.procinstid = procinstid == null ? null : procinstid.trim();
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid == null ? null : senduserid.trim();
    }

    public String getSendusername() {
        return sendusername;
    }

    public void setSendusername(String sendusername) {
        this.sendusername = sendusername == null ? null : sendusername.trim();
    }

    public String getNoticeuserid() {
        return noticeuserid;
    }

    public void setNoticeuserid(String noticeuserid) {
        this.noticeuserid = noticeuserid == null ? null : noticeuserid.trim();
    }

    public String getNoticeusername() {
        return noticeusername;
    }

    public void setNoticeusername(String noticeusername) {
        this.noticeusername = noticeusername == null ? null : noticeusername.trim();
    }

    public String getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent == null ? null : noticecontent.trim();
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype == null ? null : contenttype.trim();
    }

    public String getImportantflag() {
        return importantflag;
    }

    public void setImportantflag(String importantflag) {
        this.importantflag = importantflag == null ? null : importantflag.trim();
    }

    public Integer getNoticestatus() {
        return noticestatus;
    }

    public void setNoticestatus(Integer noticestatus) {
        this.noticestatus = noticestatus;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }

    public Integer getReadplatformtype() {
        return readplatformtype;
    }

    public void setReadplatformtype(Integer readplatformtype) {
        this.readplatformtype = readplatformtype;
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