package com.will.pojo;

import java.util.Date;

public class mc_ru_attachment {
    private String id;

    private String originalfilename;

    private String filename;

    private String filetype;

    private Long filesize;

    private String uploaduserid;

    private Date uploadtime;

    private String url;

    private Integer recordstatus;

    private Date recordtime;

    private Date lastmodifytime;

    public mc_ru_attachment(String id, String originalfilename, String filename, String filetype, Long filesize, String uploaduserid, Date uploadtime, String url, Integer recordstatus, Date recordtime, Date lastmodifytime) {
        this.id = id;
        this.originalfilename = originalfilename;
        this.filename = filename;
        this.filetype = filetype;
        this.filesize = filesize;
        this.uploaduserid = uploaduserid;
        this.uploadtime = uploadtime;
        this.url = url;
        this.recordstatus = recordstatus;
        this.recordtime = recordtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_ru_attachment() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename == null ? null : originalfilename.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public String getUploaduserid() {
        return uploaduserid;
    }

    public void setUploaduserid(String uploaduserid) {
        this.uploaduserid = uploaduserid == null ? null : uploaduserid.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getRecordstatus() {
        return recordstatus;
    }

    public void setRecordstatus(Integer recordstatus) {
        this.recordstatus = recordstatus;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }
}