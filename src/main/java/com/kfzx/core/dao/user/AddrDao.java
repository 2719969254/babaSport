package com.kfzx.core.dao.user;

import java.util.List;

import com.kfzx.core.bean.user.Addr;
import com.kfzx.core.query.user.AddrQuery;

public interface AddrDao {

	/**
	 * 添加
	 * @param addr
	 */
    Integer addAddr(Addr addr);

	/**
	 * 根据主键查找
	 * @param addrQuery
	 */
    Addr getAddrByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param addrQuery
	 */
    List<Addr> getAddrsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param addrQuery
	 */
    Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param addrQuery
	 */
    Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param addrQuery
	 */
    Integer updateAddrByKey(Addr addr);

	/**
	 * 分页查询
	 * @param addrQuery
	 */
    List<Addr> getAddrListWithPage(AddrQuery addrQuery);

	/**
	 * 集合查询
	 * @param addrQuery
	 */
    List<Addr> getAddrList(AddrQuery addrQuery);
	
	/**
	 * 总条数
	 * @param addrQuery
	 */
    int getAddrListCount(AddrQuery addrQuery);
}
