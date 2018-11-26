package com.xhh.mapper;

import com.xhh.pojo.SysProduct;

public interface SysProductMapper {

    int deleteByPrimaryKey(Integer productId);

    int insert(SysProduct record);

    int insertSelective(SysProduct record);

    SysProduct selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(SysProduct record);

    int updateByPrimaryKey(SysProduct record);
}