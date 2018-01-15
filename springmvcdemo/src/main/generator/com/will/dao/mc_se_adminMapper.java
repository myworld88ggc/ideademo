package com.will.dao;

import com.will.pojo.mc_se_admin;

public interface mc_se_adminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mc_se_admin record);

    int insertSelective(mc_se_admin record);

    mc_se_admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mc_se_admin record);

    int updateByPrimaryKey(mc_se_admin record);
}