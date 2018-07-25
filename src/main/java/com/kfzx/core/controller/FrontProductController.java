package com.kfzx.core.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

/**
 * 后台管理
 * 测试
 * @author lx
 *
 */
@Controller
public class FrontProductController {
	
	//每一个Springmvc
	@RequestMapping(value = "/test/springmvc.do")
	public String test(String name,Date birthday){
		
		
		System.out.println();
		return "";
	}

/*	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		//转换日期格式
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		
	}
	*/
	

}
