package com.will.dao;

import com.will.pojo.mc_com_group_member;

public interface mc_com_group_memberMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_com_group_member record);

    int insertSelective(mc_com_group_member record);

    mc_com_group_member selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_com_group_member record);

    int updateByPrimaryKey(mc_com_group_member record);
}