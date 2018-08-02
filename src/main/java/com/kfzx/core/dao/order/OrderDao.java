package com.kfzx.core.dao.order;

import java.util.List;

import com.kfzx.core.bean.order.Order;
import com.kfzx.core.query.order.OrderQuery;

public interface OrderDao {

	/**
	 * 添加
	 * @param order
	 */
    Integer addOrder(Order order);

	/**
	 * 根据主键查找
	 * @param orderQuery
	 */
    Order getOrderByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param orderQuery
	 */
    List<Order> getOrdersByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param orderQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param orderQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param orderQuery
	 */
    Integer updateOrderByKey(Order order);

	/**
	 * 分页查询
	 * @param orderQuery
	 */
    List<Order> getOrderListWithPage(OrderQuery orderQuery);

	/**
	 * 集合查询
	 * @param orderQuery
	 */
    List<Order> getOrderList(OrderQuery orderQuery);
	
	/**
	 * 总条数
	 * @param orderQuery
	 */
    int getOrderListCount(OrderQuery orderQuery);
}
