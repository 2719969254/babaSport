package com.kfzx;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kfzx.common.junit.SpringJunitTest;
import com.kfzx.core.bean.product.Brand;
import com.kfzx.core.query.product.BrandQuery;
import com.kfzx.core.service.product.BrandService;

/**
 * 测试
 * @author
 *
 */

public class TestBrand extends SpringJunitTest{

	@Autowired
	private BrandService brandService;
	@Test
	public void testGet() throws Exception {
		BrandQuery  brandQuery = new BrandQuery();
		
		//brandQuery.setFields("id");
		//brandQuery.setNameLike(true);
		//brandQuery.setName("金");
		brandQuery.orderbyId(false);
		
		brandQuery.setPageNo(2);
		brandQuery.setPageSize(2);
		
		List<Brand> brands = brandService.getBrandList(brandQuery);
		
		for (Brand b : brands) {
			System.out.println(b);
		}
	}
}
