package com.imooc.springboot_mybatis.dao;

import com.imooc.springboot_mybatis.entity.Area;

import java.util.List;

public interface AreaDao {

    /**
     *查询区域列表
     */
    List<Area> queryArea();
    /**
     *根据id查询区域
     */
    Area queryAreaById(int areaId);

    /**
     *插入区域信息
     */
    int insertArea(Area area);

    /**
     *更新区域信息
     */
    int updateArea(Area area);

    /**
     *删除区域信息
     */
    int deleteArea(int areaId);
}
