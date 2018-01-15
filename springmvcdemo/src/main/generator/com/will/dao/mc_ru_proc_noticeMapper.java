package com.will.dao;

import com.will.pojo.mc_ru_proc_notice;

public interface mc_ru_proc_noticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(mc_ru_proc_notice record);

    int insertSelective(mc_ru_proc_notice record);

    mc_ru_proc_notice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(mc_ru_proc_notice record);

    int updateByPrimaryKey(mc_ru_proc_notice record);
}