package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.City;
/**
 * 城市业务DAO接口类
* @ClassName: CityDao 
* @Description: TODO
* @author fanyiqing
* @date 2017年6月14日 上午10:05:18
 */
public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
