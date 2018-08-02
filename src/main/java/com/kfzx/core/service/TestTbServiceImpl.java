package com.kfzx.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kfzx.core.bean.TestTb;
import com.kfzx.core.dao.TestTbDao;

/**
 * 
 * @author
 *
 */
@Service
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Resource
	private TestTbDao testTbDao;
	
	public void addTestTb(TestTb testTb) {
		testTbDao.addTestTb(testTb);
		
		throw new RuntimeException();
	}

}
