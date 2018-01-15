package com.will.dao;

import com.will.pojo.mc_proc_user_in_role;

public interface mc_proc_user_in_roleMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_user_in_role record);

    int insertSelective(mc_proc_user_in_role record);

    mc_proc_user_in_role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_user_in_role record);

    int updateByPrimaryKey(mc_proc_user_in_role record);
}