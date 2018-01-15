package com.will.dao;

import com.will.pojo.mc_proc_type;

public interface mc_proc_typeMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_type record);

    int insertSelective(mc_proc_type record);

    mc_proc_type selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_type record);

    int updateByPrimaryKey(mc_proc_type record);
}