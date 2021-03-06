package com.kfzx.core.dao.country;

import java.util.List;

import com.kfzx.core.bean.country.Town;
import com.kfzx.core.query.country.TownQuery;

public interface TownDao {

	/**
	 * 添加
	 * @param town
	 */
    Integer addTown(Town town);

	/**
	 * 根据主键查找
	 * @param townQuery
	 */
    Town getTownByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param townQuery
	 */
    List<Town> getTownsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param townQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param townQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param townQuery
	 */
    Integer updateTownByKey(Town town);

	/**
	 * 分页查询
	 * @param townQuery
	 */
    List<Town> getTownListWithPage(TownQuery townQuery);

	/**
	 * 集合查询
	 * @param townQuery
	 */
    List<Town> getTownList(TownQuery townQuery);
	
	/**
	 * 总条数
	 * @param townQuery
	 */
    int getTownListCount(TownQuery townQuery);
}
