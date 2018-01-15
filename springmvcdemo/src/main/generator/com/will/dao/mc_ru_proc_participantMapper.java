package com.will.dao;

import com.will.pojo.mc_ru_proc_participant;

public interface mc_ru_proc_participantMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_ru_proc_participant record);

    int insertSelective(mc_ru_proc_participant record);

    mc_ru_proc_participant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_ru_proc_participant record);

    int updateByPrimaryKey(mc_ru_proc_participant record);
}