package com.will.pojo;

import java.util.Date;

public class mc_ru_comment {
    private String id;

    private String procinstid;

    private String taskid;

    private String commentuserid;

    private String commentusername;

    private Integer contenttype;

    private String commentto;

    private String commentcontent;

    private Date commenttime;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_ru_comment(String id, String procinstid, String taskid, String commentuserid, String commentusername, Integer contenttype, String commentto, String commentcontent, Date commenttime, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.procinstid = procinstid;
        this.taskid = taskid;
        this.commentuserid = commentuserid;
        this.commentusername = commentusername;
        this.contenttype = contenttype;
        this.commentto = commentto;
        this.commentcontent = commentcontent;
        this.commenttime = commenttime;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_comment() {
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

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getCommentuserid() {
        return commentuserid;
    }

    public void setCommentuserid(String commentuserid) {
        this.commentuserid = commentuserid == null ? null : commentuserid.trim();
    }

    public String getCommentusername() {
        return commentusername;
    }

    public void setCommentusername(String commentusername) {
        this.commentusername = commentusername == null ? null : commentusername.trim();
    }

    public Integer getContenttype() {
        return contenttype;
    }

    public void setContenttype(Integer contenttype) {
        this.contenttype = contenttype;
    }

    public String getCommentto() {
        return commentto;
    }

    public void setCommentto(String commentto) {
        this.commentto = commentto == null ? null : commentto.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
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