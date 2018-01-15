package com.will.dao;

import com.will.pojo.mc_com_employee;

public interface mc_com_employeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_com_employee record);

    int insertSelective(mc_com_employee record);

    mc_com_employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_com_employee record);

    int updateByPrimaryKey(mc_com_employee record);
}