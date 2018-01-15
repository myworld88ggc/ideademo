package com.will.dao;

import com.will.pojo.mc_com_department;

public interface mc_com_departmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_com_department record);

    int insertSelective(mc_com_department record);

    mc_com_department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_com_department record);

    int updateByPrimaryKey(mc_com_department record);
}