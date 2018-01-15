package com.will.dao;

import com.will.pojo.mc_se_dictionary;

public interface mc_se_dictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_se_dictionary record);

    int insertSelective(mc_se_dictionary record);

    mc_se_dictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_se_dictionary record);

    int updateByPrimaryKey(mc_se_dictionary record);
}