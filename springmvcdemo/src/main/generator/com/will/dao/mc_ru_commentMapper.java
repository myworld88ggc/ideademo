package com.will.dao;

import com.will.pojo.mc_ru_comment;

public interface mc_ru_commentMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_comment record);

    int insertSelective(mc_ru_comment record);

    mc_ru_comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_comment record);

    int updateByPrimaryKey(mc_ru_comment record);
}