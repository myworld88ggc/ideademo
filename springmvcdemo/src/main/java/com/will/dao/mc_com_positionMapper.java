package com.will.dao;

import com.will.pojo.mc_com_position;

public interface mc_com_positionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_com_position record);

    int insertSelective(mc_com_position record);

    mc_com_position selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_com_position record);

    int updateByPrimaryKey(mc_com_position record);
}