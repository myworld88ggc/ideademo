package com.will.dao;

import com.will.pojo.mc_ru_attachment;

public interface mc_ru_attachmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_attachment record);

    int insertSelective(mc_ru_attachment record);

    mc_ru_attachment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_attachment record);

    int updateByPrimaryKey(mc_ru_attachment record);
}