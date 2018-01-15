package com.will.dao;

import com.will.pojo.mc_ru_notice_content;

public interface mc_ru_notice_contentMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_ru_notice_content record);

    int insertSelective(mc_ru_notice_content record);

    mc_ru_notice_content selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_ru_notice_content record);

    int updateByPrimaryKey(mc_ru_notice_content record);
}