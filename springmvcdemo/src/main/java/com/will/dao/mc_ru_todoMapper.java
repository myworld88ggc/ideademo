package com.will.dao;

import com.will.pojo.mc_ru_todo;

public interface mc_ru_todoMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_todo record);

    int insertSelective(mc_ru_todo record);

    mc_ru_todo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_todo record);

    int updateByPrimaryKey(mc_ru_todo record);
}