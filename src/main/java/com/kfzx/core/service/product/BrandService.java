package com.kfzx.core.service.product;

import java.util.List;

import cn.itcast.common.page.Pagination;
import com.kfzx.core.bean.product.Brand;
import com.kfzx.core.query.product.BrandQuery;

/**
 * 品牌
 * @author
 *
 */
public interface BrandService {

	Pagination getBrandListWithPage(Brand brand);
	
	//查询集合
    List<Brand> getBrandList(BrandQuery brandQuery);
	
	//添加品牌
    void addBrand(Brand brand);
	
	//删除
    void deleteBrandByKey(Integer id);
	//删除 批量
    void deleteBrandByKeys(Integer[] ids);//List<Integer>  ids
	//修改
    void updateBrandByKey(Brand brand);
	
	//
    Brand getBrandByKey(Integer id);
}
