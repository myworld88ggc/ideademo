package com.will.dao;

import com.will.pojo.mc_se_system;

public interface mc_se_systemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mc_se_system record);

    int insertSelective(mc_se_system record);

    mc_se_system selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mc_se_system record);

    int updateByPrimaryKey(mc_se_system record);
}