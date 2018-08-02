package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Type;
import com.kfzx.core.query.product.TypeQuery;

public interface TypeDao {

	/**
	 * 添加
	 * @param type
	 */
    Integer addType(Type type);

	/**
	 * 根据主键查找
	 * @param typeQuery
	 */
    Type getTypeByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param typeQuery
	 */
    List<Type> getTypesByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param typeQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param typeQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param typeQuery
	 */
    Integer updateTypeByKey(Type type);

	/**
	 * 分页查询
	 * @param typeQuery
	 */
    List<Type> getTypeListWithPage(TypeQuery typeQuery);

	/**
	 * 集合查询
	 * @param typeQuery
	 */
    List<Type> getTypeList(TypeQuery typeQuery);
	
	/**
	 * 总条数
	 * @param typeQuery
	 */
    int getTypeListCount(TypeQuery typeQuery);
}
