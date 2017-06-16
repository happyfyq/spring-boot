package com.example.demo.service;

import com.example.demo.domain.City;

/**
 * 城市业务接口类
* @ClassName: CityService 
* @Description: TODO
* @author fanyiqing
* @date 2017年6月14日 上午10:03:05
 */
public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);

}
