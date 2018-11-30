package com.xhh.mapper;

import com.xhh.pojo.SysDataDictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SysDataDictionaryMapper {
    /*查看所有的字典信息*/
    List<SysDataDictionary> findAllDictionary(Map<String,Object> map);
    /*删除字典信息*/
    int deleteByPrimaryKey(Integer dictionaryId);
    /*增加字典信息*/
    int insert(SysDataDictionary record);
    /*动态增加*/
    int insertSelective(SysDataDictionary record);
    /*根据Id查询某一字典信息*/
    SysDataDictionary selectByPrimaryKey(Integer dictionaryId);
    /*动态修改字典信息*/
    int updateByPrimaryKeySelective(SysDataDictionary record);
    /*修改字典信息*/
    int updateByPrimaryKey(SysDataDictionary record);
}