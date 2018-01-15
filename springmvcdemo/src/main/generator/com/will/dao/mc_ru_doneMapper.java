package com.will.dao;

import com.will.pojo.mc_ru_done;

public interface mc_ru_doneMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_done record);

    int insertSelective(mc_ru_done record);

    mc_ru_done selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_done record);

    int updateByPrimaryKey(mc_ru_done record);
}