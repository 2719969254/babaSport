package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Sku;
import com.kfzx.core.query.product.SkuQuery;

public interface SkuDao {

	/**
	 * 添加
	 * @param sku
	 */
    Integer addSku(Sku sku);

	/**
	 * 根据主键查找
	 * @param skuQuery
	 */
    Sku getSkuByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param skuQuery
	 */
    List<Sku> getSkusByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param skuQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param skuQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param skuQuery
	 */
    Integer updateSkuByKey(Sku sku);

	/**
	 * 分页查询
	 * @param skuQuery
	 */
    List<Sku> getSkuListWithPage(SkuQuery skuQuery);

	/**
	 * 集合查询
	 * @param skuQuery
	 */
    List<Sku> getSkuList(SkuQuery skuQuery);
	
	/**
	 * 总条数
	 * @param skuQuery
	 */
    int getSkuListCount(SkuQuery skuQuery);
	/**
	 * 库存大于>0
	 */
    List<Sku> getStock(Integer productId);

}
