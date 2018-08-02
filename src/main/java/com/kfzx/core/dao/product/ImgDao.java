package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Img;
import com.kfzx.core.query.product.ImgQuery;

public interface ImgDao {

	/**
	 * 添加
	 * @param img
	 */
    Integer addImg(Img img);

	/**
	 * 根据主键查找
	 * @param imgQuery
	 */
    Img getImgByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param imgQuery
	 */
    List<Img> getImgsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param imgQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param imgQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param imgQuery
	 */
    Integer updateImgByKey(Img img);

	/**
	 * 分页查询
	 * @param imgQuery
	 */
    List<Img> getImgListWithPage(ImgQuery imgQuery);

	/**
	 * 集合查询
	 * @param imgQuery
	 */
    List<Img> getImgList(ImgQuery imgQuery);
	
	/**
	 * 总条数
	 * @param imgQuery
	 */
    int getImgListCount(ImgQuery imgQuery);
}
