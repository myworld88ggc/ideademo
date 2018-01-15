package com.will.dao;

import com.will.pojo.mc_proc_agent;

public interface mc_proc_agentMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_agent record);

    int insertSelective(mc_proc_agent record);

    mc_proc_agent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_agent record);

    int updateByPrimaryKey(mc_proc_agent record);
}