package com.will.dao;

import com.will.pojo.mc_se_process;

public interface mc_se_processMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mc_se_process record);

    int insertSelective(mc_se_process record);

    mc_se_process selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mc_se_process record);

    int updateByPrimaryKey(mc_se_process record);
}