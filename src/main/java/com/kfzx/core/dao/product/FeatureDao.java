package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Feature;
import com.kfzx.core.query.product.FeatureQuery;

public interface FeatureDao {

	/**
	 * 添加
	 * @param feature
	 */
    Integer addFeature(Feature feature);

	/**
	 * 根据主键查找
	 * @param featureQuery
	 */
    Feature getFeatureByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param featureQuery
	 */
    List<Feature> getFeaturesByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param featureQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param featureQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param featureQuery
	 */
    Integer updateFeatureByKey(Feature feature);

	/**
	 * 分页查询
	 * @param featureQuery
	 */
    List<Feature> getFeatureListWithPage(FeatureQuery featureQuery);

	/**
	 * 集合查询
	 * @param featureQuery
	 */
    List<Feature> getFeatureList(FeatureQuery featureQuery);
	
	/**
	 * 总条数
	 * @param featureQuery
	 */
    int getFeatureListCount(FeatureQuery featureQuery);
}
