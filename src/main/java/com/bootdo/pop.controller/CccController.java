package com.bootdo.pop.controller;



import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 21:33:23
 */
 
@Controller
@RequestMapping("/pop/customers")
public class CccController {

	@GetMapping()
	@RequiresPermissions("pop:customers:customers")
	String Customers(){
	    return "pop/customers/customers";
	}

	@GetMapping("/fractiontos")
	@RequiresPermissions("pop:customers:fractiontos")
	String fractiontos(){
		return "pop/customers/fractiontos";
	}

	
	@GetMapping("/add")
	@RequiresPermissions("pop:customers:add")
	String add(){
	    return "pop/customers/add";
	}


}
