package com.will.dao;

import com.will.pojo.mc_proc_node;

public interface mc_proc_nodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_node record);

    int insertSelective(mc_proc_node record);

    mc_proc_node selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_node record);

    int updateByPrimaryKey(mc_proc_node record);
}