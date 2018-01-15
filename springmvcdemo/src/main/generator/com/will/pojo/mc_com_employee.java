package com.will.pojo;

import java.util.Date;

public class mc_com_employee {
    private Long id;

    private String employeeId;

    private String name;

    private String gender;

    private String birthday;

    private String ethnicType;

    private String departmentName;

    private String deptShortName;

    private String departmentCode;

    private String firstWorkDate;

    private String joinDate;

    private String positionName;

    private String positionCode;

    private String education;

    private String email;

    private String appointName;

    private Integer employeeRcd;

    private String supervisorIdPath;

    private String supervisorNamePath;

    private String jobCode;

    private String costCenterCode;

    private String costCenterTypeDesc;

    private String companyCode;

    private String companyCostCenterName;

    private String companyCostCenterCode;

    private String leaderId;

    private String managerLvl;

    private String jobCodeName;

    private String lastModifyDate;

    private String employeeStatus;

    private String effdt;

    private String locationName;

    private String locationCode;

    private String idCard;

    private String mobile;

    private Integer recordstatus;

    private Date createtime;

    private Date lastmodifytime;

    public mc_com_employee(Long id, String employeeId, String name, String gender, String birthday, String ethnicType, String departmentName, String deptShortName, String departmentCode, String firstWorkDate, String joinDate, String positionName, String positionCode, String education, String email, String appointName, Integer employeeRcd, String supervisorIdPath, String supervisorNamePath, String jobCode, String costCenterCode, String costCenterTypeDesc, String companyCode, String companyCostCenterName, String companyCostCenterCode, String leaderId, String managerLvl, String jobCodeName, String lastModifyDate, String employeeStatus, String effdt, String locationName, String locationCode, String idCard, String mobile, Integer recordstatus, Date createtime, Date lastmodifytime) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.ethnicType = ethnicType;
        this.departmentName = departmentName;
        this.deptShortName = deptShortName;
        this.departmentCode = departmentCode;
        this.firstWorkDate = firstWorkDate;
        this.joinDate = joinDate;
        this.positionName = positionName;
        this.positionCode = positionCode;
        this.education = education;
        this.email = email;
        this.appointName = appointName;
        this.employeeRcd = employeeRcd;
        this.supervisorIdPath = supervisorIdPath;
        this.supervisorNamePath = supervisorNamePath;
        this.jobCode = jobCode;
        this.costCenterCode = costCenterCode;
        this.costCenterTypeDesc = costCenterTypeDesc;
        this.companyCode = companyCode;
        this.companyCostCenterName = companyCostCenterName;
        this.companyCostCenterCode = companyCostCenterCode;
        this.leaderId = leaderId;
        this.managerLvl = managerLvl;
        this.jobCodeName = jobCodeName;
        this.lastModifyDate = lastModifyDate;
        this.employeeStatus = employeeStatus;
        this.effdt = effdt;
        this.locationName = locationName;
        this.locationCode = locationCode;
        this.idCard = idCard;
        this.mobile = mobile;
        this.recordstatus = recordstatus;
        this.createtime = createtime;
        this.lastmodifytime = lastmodifytime;
    }

    public mc_com_employee() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getEthnicType() {
        return ethnicType;
    }

    public void setEthnicType(String ethnicType) {
        this.ethnicType = ethnicType == null ? null : ethnicType.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDeptShortName() {
        return deptShortName;
    }

    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName == null ? null : deptShortName.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getFirstWorkDate() {
        return firstWorkDate;
    }

    public void setFirstWorkDate(String firstWorkDate) {
        this.firstWorkDate = firstWorkDate == null ? null : firstWorkDate.trim();
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate == null ? null : joinDate.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAppointName() {
        return appointName;
    }

    public void setAppointName(String appointName) {
        this.appointName = appointName == null ? null : appointName.trim();
    }

    public Integer getEmployeeRcd() {
        return employeeRcd;
    }

    public void setEmployeeRcd(Integer employeeRcd) {
        this.employeeRcd = employeeRcd;
    }

    public String getSupervisorIdPath() {
        return supervisorIdPath;
    }

    public void setSupervisorIdPath(String supervisorIdPath) {
        this.supervisorIdPath = supervisorIdPath == null ? null : supervisorIdPath.trim();
    }

    public String getSupervisorNamePath() {
        return supervisorNamePath;
    }

    public void setSupervisorNamePath(String supervisorNamePath) {
        this.supervisorNamePath = supervisorNamePath == null ? null : supervisorNamePath.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode == null ? null : costCenterCode.trim();
    }

    public String getCostCenterTypeDesc() {
        return costCenterTypeDesc;
    }

    public void setCostCenterTypeDesc(String costCenterTypeDesc) {
        this.costCenterTypeDesc = costCenterTypeDesc == null ? null : costCenterTypeDesc.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyCostCenterName() {
        return companyCostCenterName;
    }

    public void setCompanyCostCenterName(String companyCostCenterName) {
        this.companyCostCenterName = companyCostCenterName == null ? null : companyCostCenterName.trim();
    }

    public String getCompanyCostCenterCode() {
        return companyCostCenterCode;
    }

    public void setCompanyCostCenterCode(String companyCostCenterCode) {
        this.companyCostCenterCode = companyCostCenterCode == null ? null : companyCostCenterCode.trim();
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getManagerLvl() {
        return managerLvl;
    }

    public void setManagerLvl(String managerLvl) {
        this.managerLvl = managerLvl == null ? null : managerLvl.trim();
    }

    public String getJobCodeName() {
        return jobCodeName;
    }

    public void setJobCodeName(String jobCodeName) {
        this.jobCodeName = jobCodeName == null ? null : jobCodeName.trim();
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate == null ? null : lastModifyDate.trim();
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus == null ? null : employeeStatus.trim();
    }

    public String getEffdt() {
        return effdt;
    }

    public void setEffdt(String effdt) {
        this.effdt = effdt == null ? null : effdt.trim();
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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