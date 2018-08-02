package com.kfzx.core.service.product;

import java.util.List;

import cn.itcast.common.page.Pagination;
import com.kfzx.core.bean.product.Sku;
import com.kfzx.core.query.product.SkuQuery;

/**
 * 
@author
 */
public interface SkuService {
	/**
	 * 基本插入
	 * 
	 * @return
	 */
    Integer addSku(Sku sku);

	/**
	 * 根据主键查询
	 */
    Sku getSkuByKey(Integer id);

	/**
	 * 根据主键批量查询
	 */
    List<Sku> getSkusByKeys(List<Integer> idList);

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
    Integer updateSkuByKey(Sku sku);

	/**
	 * 根据条件查询分页查询
	 * 
	 * @param skuQuery
	 *            查询条件
	 * @return
	 */
    Pagination getSkuListWithPage(SkuQuery skuQuery);

	/**
	 * 根据条件查询
	 * 
	 * @param skuQuery
	 *            查询条件
	 * @return
	 */
    List<Sku> getSkuList(SkuQuery skuQuery);
	
	/**
	 * 库存大于>0
	 */
    List<Sku> getStock(Integer productId);
	
}
