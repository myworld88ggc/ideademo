package com.will.pojo;

import java.util.Date;

public class mc_com_department {
    private Long id;

    private String deptId;

    private String deptName;

    private String deptType;

    private String deptTypeName;

    private String deptShortName;

    private String leaderId;

    private String deptLevel;

    private String deptCode;

    private String deptFullCode;

    private String deptFullName;

    private String setId;

    private String companyName;

    private String lastModifyDate;

    private String companyCode;

    private String effdt;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_com_department(Long id, String deptId, String deptName, String deptType, String deptTypeName, String deptShortName, String leaderId, String deptLevel, String deptCode, String deptFullCode, String deptFullName, String setId, String companyName, String lastModifyDate, String companyCode, String effdt, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptType = deptType;
        this.deptTypeName = deptTypeName;
        this.deptShortName = deptShortName;
        this.leaderId = leaderId;
        this.deptLevel = deptLevel;
        this.deptCode = deptCode;
        this.deptFullCode = deptFullCode;
        this.deptFullName = deptFullName;
        this.setId = setId;
        this.companyName = companyName;
        this.lastModifyDate = lastModifyDate;
        this.companyCode = companyCode;
        this.effdt = effdt;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_com_department() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType == null ? null : deptType.trim();
    }

    public String getDeptTypeName() {
        return deptTypeName;
    }

    public void setDeptTypeName(String deptTypeName) {
        this.deptTypeName = deptTypeName == null ? null : deptTypeName.trim();
    }

    public String getDeptShortName() {
        return deptShortName;
    }

    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName == null ? null : deptShortName.trim();
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel == null ? null : deptLevel.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptFullCode() {
        return deptFullCode;
    }

    public void setDeptFullCode(String deptFullCode) {
        this.deptFullCode = deptFullCode == null ? null : deptFullCode.trim();
    }

    public String getDeptFullName() {
        return deptFullName;
    }

    public void setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName == null ? null : deptFullName.trim();
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId == null ? null : setId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getEffdt() {
        return effdt;
    }

    public void setEffdt(String effdt) {
        this.effdt = effdt == null ? null : effdt.trim();
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