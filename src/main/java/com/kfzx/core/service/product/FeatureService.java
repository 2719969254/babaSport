package com.kfzx.core.service.product;

import java.util.List;

import cn.itcast.common.page.Pagination;
import com.kfzx.core.bean.product.Feature;
import com.kfzx.core.query.product.FeatureQuery;

/**
 * 
@author
 */
public interface FeatureService {
	/**
	 * 基本插入
	 * 
	 * @return
	 */
    Integer addFeature(Feature feature);

	/**
	 * 根据主键查询
	 */
    Feature getFeatureByKey(Integer id);

	/**
	 * 根据主键批量查询
	 */
    List<Feature> getFeaturesByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * 
	 * @return
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * 
	 * @return
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * 
	 * @return
	 */
    Integer updateFeatureByKey(Feature feature);

	/**
	 * 根据条件查询分页查询
	 * 
	 * @param featureQuery
	 *            查询条件
	 * @return
	 */
    Pagination getFeatureListWithPage(FeatureQuery featureQuery);

	/**
	 * 根据条件查询
	 * 
	 * @param featureQuery
	 *            查询条件
	 * @return
	 */
    List<Feature> getFeatureList(FeatureQuery featureQuery);
}
