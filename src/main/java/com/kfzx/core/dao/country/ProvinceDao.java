package com.kfzx.core.dao.country;

import java.util.List;

import com.kfzx.core.bean.country.Province;
import com.kfzx.core.query.country.ProvinceQuery;

public interface ProvinceDao {

	/**
	 * 添加
	 * @param province
	 */
    Integer addProvince(Province province);

	/**
	 * 根据主键查找
	 * @param id
	 */
    Province getProvinceByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param idList
	 */
    List<Province> getProvincesByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param id
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param idList
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param province
	 */
    Integer updateProvinceByKey(Province province);

	/**
	 * 分页查询
	 * @param provinceQuery
	 */
    List<Province> getProvinceListWithPage(ProvinceQuery provinceQuery);

	/**
	 * 集合查询
	 * @param provinceQuery
	 */
    List<Province> getProvinceList(ProvinceQuery provinceQuery);
	
	/**
	 * 总条数
	 * @param provinceQuery
	 */
    int getProvinceListCount(ProvinceQuery provinceQuery);
}
