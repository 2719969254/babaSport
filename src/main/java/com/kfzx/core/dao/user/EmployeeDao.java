package com.kfzx.core.dao.user;

import java.util.List;

import com.kfzx.core.bean.user.Employee;
import com.kfzx.core.query.user.EmployeeQuery;

public interface EmployeeDao {

	/**
	 * 添加
	 * @param employee
	 */
    Integer addEmployee(Employee employee);

	/**
	 * 根据主键查找
	 * @param employeeQuery
	 */
    Employee getEmployeeByKey(String id);

	/**
	 * 根据主键批量查找
	 * @param employeeQuery
	 */
    List<Employee> getEmployeesByKeys(List<String> idList);

	/**
	 * 根据主键删除
	 * @param employeeQuery
	 */
    Integer deleteByKey(String id);

	/**
	 * 根据主键批量删除
	 * @param employeeQuery
	 */
    Integer deleteByKeys(List<String> idList);

	/**
	 * 根据主键更新
	 * @param employeeQuery
	 */
    Integer updateEmployeeByKey(Employee employee);

	/**
	 * 分页查询
	 * @param employeeQuery
	 */
    List<Employee> getEmployeeListWithPage(EmployeeQuery employeeQuery);

	/**
	 * 集合查询
	 * @param employeeQuery
	 */
    List<Employee> getEmployeeList(EmployeeQuery employeeQuery);
	
	/**
	 * 总条数
	 * @param employeeQuery
	 */
    int getEmployeeListCount(EmployeeQuery employeeQuery);
}
