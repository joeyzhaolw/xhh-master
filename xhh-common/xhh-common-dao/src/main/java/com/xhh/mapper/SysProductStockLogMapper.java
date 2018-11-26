package com.xhh.mapper;


import com.xhh.pojo.SysProductStockLog;

public interface SysProductStockLogMapper {

    int deleteByPrimaryKey(Integer stockLogId);

    int insert(SysProductStockLog record);

    int insertSelective(SysProductStockLog record);

    SysProductStockLog selectByPrimaryKey(Integer stockLogId);

    int updateByPrimaryKeySelective(SysProductStockLog record);

    int updateByPrimaryKey(SysProductStockLog record);
}