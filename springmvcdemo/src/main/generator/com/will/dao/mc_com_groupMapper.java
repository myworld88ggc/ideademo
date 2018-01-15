package com.will.dao;

import com.will.pojo.mc_com_group;

public interface mc_com_groupMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_com_group record);

    int insertSelective(mc_com_group record);

    mc_com_group selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_com_group record);

    int updateByPrimaryKey(mc_com_group record);
}