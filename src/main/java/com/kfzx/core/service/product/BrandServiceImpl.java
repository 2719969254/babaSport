package com.kfzx.core.service.product;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;
import com.kfzx.core.bean.product.Brand;
import com.kfzx.core.dao.product.BrandDao;
import com.kfzx.core.query.product.BrandQuery;

/**
 * 品牌事务
 * @author
 *
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService{
	
	@Resource
	private BrandDao brandDao;

	@Transactional(readOnly = true)
	public Pagination getBrandListWithPage(Brand brand){
		//1:起始页  startRow = (pageNo - 1)*pageSize
		//2:每页数
		//3:总记录数
		Pagination  pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandDao.getBrandCount(brand));
		//Brand集合
		pagination.setList(brandDao.getBrandListWithPage(brand));
		
		return pagination;
	}

	@Override
	public void addBrand(Brand brand) {
		brandDao.addBrand(brand);
	}

	@Override
	public void deleteBrandByKey(Integer id) {
		brandDao.deleteBrandByKey(id);
		
	}

	@Override
	public void deleteBrandByKeys(Integer[] ids) {
		brandDao.deleteBrandByKeys(ids);
		
	}

	@Override
	public void updateBrandByKey(Brand brand) {
		brandDao.updateBrandByKey(brand);
		
	}

	@Override
	public Brand getBrandByKey(Integer id) {
		// TODO Auto-generated method stub
		return brandDao.getBrandByKey(id);
	}

	@Override
	public List<Brand> getBrandList(BrandQuery brandQuery) {
		// TODO Auto-generated method stub
		return brandDao.getBrandList(brandQuery);
	}
}
