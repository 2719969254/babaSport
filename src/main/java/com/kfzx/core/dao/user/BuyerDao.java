package com.kfzx.core.dao.user;

import java.util.List;

import com.kfzx.core.bean.user.Buyer;
import com.kfzx.core.query.user.BuyerQuery;

public interface BuyerDao {

	/**
	 * 添加
	 * @param buyer
	 */
    Integer addBuyer(Buyer buyer);

	/**
	 * 根据主键查找
	 * @param buyerQuery
	 */
    Buyer getBuyerByKey(String id);

	/**
	 * 根据主键批量查找
	 * @param buyerQuery
	 */
    List<Buyer> getBuyersByKeys(List<String> idList);

	/**
	 * 根据主键删除
	 * @param buyerQuery
	 */
    Integer deleteByKey(String id);

	/**
	 * 根据主键批量删除
	 * @param buyerQuery
	 */
    Integer deleteByKeys(List<String> idList);

	/**
	 * 根据主键更新
	 * @param buyerQuery
	 */
    Integer updateBuyerByKey(Buyer buyer);

	/**
	 * 分页查询
	 * @param buyerQuery
	 */
    List<Buyer> getBuyerListWithPage(BuyerQuery buyerQuery);

	/**
	 * 集合查询
	 * @param buyerQuery
	 */
    List<Buyer> getBuyerList(BuyerQuery buyerQuery);
	
	/**
	 * 总条数
	 * @param buyerQuery
	 */
    int getBuyerListCount(BuyerQuery buyerQuery);
}
