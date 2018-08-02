package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Product;
import com.kfzx.core.query.product.ProductQuery;

public interface ProductDao {

	/**
	 * 添加
	 * @param product
	 */
    Integer addProduct(Product product);

	/**
	 * 根据主键查找
	 * @param productQuery
	 */
    Product getProductByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param productQuery
	 */
    List<Product> getProductsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param productQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param productQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param productQuery
	 */
    Integer updateProductByKey(Product product);

	/**
	 * 分页查询
	 * @param productQuery
	 */
    List<Product> getProductListWithPage(ProductQuery productQuery);

	/**
	 * 集合查询
	 * @param productQuery
	 */
    List<Product> getProductList(ProductQuery productQuery);
	
	/**
	 * 总条数
	 * @param productQuery
	 */
    int getProductListCount(ProductQuery productQuery);
}
