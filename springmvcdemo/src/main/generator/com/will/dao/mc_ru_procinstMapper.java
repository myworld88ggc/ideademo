package com.will.dao;

import com.will.pojo.mc_ru_procinst;

public interface mc_ru_procinstMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_procinst record);

    int insertSelective(mc_ru_procinst record);

    mc_ru_procinst selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_procinst record);

    int updateByPrimaryKey(mc_ru_procinst record);
}