package com.kfzx.core.dao.product;

import java.util.List;

import com.kfzx.core.bean.product.Color;
import com.kfzx.core.query.product.ColorQuery;

public interface ColorDao {

	/**
	 * 添加
	 * @param color
	 */
    Integer addColor(Color color);

	/**
	 * 根据主键查找
	 * @param colorQuery
	 */
    Color getColorByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param colorQuery
	 */
    List<Color> getColorsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param colorQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param colorQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param colorQuery
	 */
    Integer updateColorByKey(Color color);

	/**
	 * 分页查询
	 * @param colorQuery
	 */
    List<Color> getColorListWithPage(ColorQuery colorQuery);

	/**
	 * 集合查询
	 * @param colorQuery
	 */
    List<Color> getColorList(ColorQuery colorQuery);
	
	/**
	 * 总条数
	 * @param colorQuery
	 */
    int getColorListCount(ColorQuery colorQuery);
}
