package com.will.dao;

import com.will.pojo.mc_proc_role;

public interface mc_proc_roleMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_role record);

    int insertSelective(mc_proc_role record);

    mc_proc_role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_role record);

    int updateByPrimaryKey(mc_proc_role record);
}