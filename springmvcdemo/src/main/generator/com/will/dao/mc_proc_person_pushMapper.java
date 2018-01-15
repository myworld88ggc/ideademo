package com.will.dao;

import com.will.pojo.mc_proc_person_push;

public interface mc_proc_person_pushMapper {
    int deleteByPrimaryKey(String id);

    int insert(mc_proc_person_push record);

    int insertSelective(mc_proc_person_push record);

    mc_proc_person_push selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mc_proc_person_push record);

    int updateByPrimaryKey(mc_proc_person_push record);
}