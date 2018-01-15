package com.will.pojo;

import java.util.Date;

public class mc_com_position {
    private Long id;

    private String companyName;

    private String companyCode;

    private String departmentName;

    private String departmentCode;

    private String positionCode;

    private String positionName;

    private String positionShortName;

    private String remark;

    private String location;

    private String locationDes;

    private String reportRealLine;

    private String reportDottedLine;

    private String fullPartTime;

    private String iskeyposition;

    private String shift;

    private String status;

    private String dataOrigin;

    private String ext1;

    private String ext2;

    private String bucode;

    private String regionTmp;

    private String effdt;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_com_position(Long id, String companyName, String companyCode, String departmentName, String departmentCode, String positionCode, String positionName, String positionShortName, String remark, String location, String locationDes, String reportRealLine, String reportDottedLine, String fullPartTime, String iskeyposition, String shift, String status, String dataOrigin, String ext1, String ext2, String bucode, String regionTmp, String effdt, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.positionShortName = positionShortName;
        this.remark = remark;
        this.location = location;
        this.locationDes = locationDes;
        this.reportRealLine = reportRealLine;
        this.reportDottedLine = reportDottedLine;
        this.fullPartTime = fullPartTime;
        this.iskeyposition = iskeyposition;
        this.shift = shift;
        this.status = status;
        this.dataOrigin = dataOrigin;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.bucode = bucode;
        this.regionTmp = regionTmp;
        this.effdt = effdt;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_com_position() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionShortName() {
        return positionShortName;
    }

    public void setPositionShortName(String positionShortName) {
        this.positionShortName = positionShortName == null ? null : positionShortName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLocationDes() {
        return locationDes;
    }

    public void setLocationDes(String locationDes) {
        this.locationDes = locationDes == null ? null : locationDes.trim();
    }

    public String getReportRealLine() {
        return reportRealLine;
    }

    public void setReportRealLine(String reportRealLine) {
        this.reportRealLine = reportRealLine == null ? null : reportRealLine.trim();
    }

    public String getReportDottedLine() {
        return reportDottedLine;
    }

    public void setReportDottedLine(String reportDottedLine) {
        this.reportDottedLine = reportDottedLine == null ? null : reportDottedLine.trim();
    }

    public String getFullPartTime() {
        return fullPartTime;
    }

    public void setFullPartTime(String fullPartTime) {
        this.fullPartTime = fullPartTime == null ? null : fullPartTime.trim();
    }

    public String getIskeyposition() {
        return iskeyposition;
    }

    public void setIskeyposition(String iskeyposition) {
        this.iskeyposition = iskeyposition == null ? null : iskeyposition.trim();
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift == null ? null : shift.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin == null ? null : dataOrigin.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getBucode() {
        return bucode;
    }

    public void setBucode(String bucode) {
        this.bucode = bucode == null ? null : bucode.trim();
    }

    public String getRegionTmp() {
        return regionTmp;
    }

    public void setRegionTmp(String regionTmp) {
        this.regionTmp = regionTmp == null ? null : regionTmp.trim();
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