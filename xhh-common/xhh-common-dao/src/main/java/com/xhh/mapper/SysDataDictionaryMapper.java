package com.xhh.mapper;

import com.xhh.pojo.SysDataDictionary;

public interface SysDataDictionaryMapper {

    int deleteByPrimaryKey(Integer dictionaryId);

    int insert(SysDataDictionary record);

    int insertSelective(SysDataDictionary record);

    SysDataDictionary selectByPrimaryKey(Integer dictionaryId);

    int updateByPrimaryKeySelective(SysDataDictionary record);

    int updateByPrimaryKey(SysDataDictionary record);
}