package com.kfzx.core.dao.order;

import java.util.List;

import com.kfzx.core.bean.order.Detail;
import com.kfzx.core.query.order.DetailQuery;

public interface DetailDao {

	/**
	 * 添加
	 * @param detail
	 */
    Integer addDetail(Detail detail);

	/**
	 * 根据主键查找
	 * @param detailQuery
	 */
    Detail getDetailByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param detailQuery
	 */
    List<Detail> getDetailsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param detailQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param detailQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param detailQuery
	 */
    Integer updateDetailByKey(Detail detail);

	/**
	 * 分页查询
	 * @param detailQuery
	 */
    List<Detail> getDetailListWithPage(DetailQuery detailQuery);

	/**
	 * 集合查询
	 * @param detailQuery
	 */
    List<Detail> getDetailList(DetailQuery detailQuery);
	
	/**
	 * 总条数
	 * @param detailQuery
	 */
    int getDetailListCount(DetailQuery detailQuery);
}
