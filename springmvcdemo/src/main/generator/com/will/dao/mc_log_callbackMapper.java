package com.will.dao;

import com.will.pojo.mc_log_callback;

public interface mc_log_callbackMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_log_callback record);

    int insertSelective(mc_log_callback record);

    mc_log_callback selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_log_callback record);

    int updateByPrimaryKey(mc_log_callback record);
}