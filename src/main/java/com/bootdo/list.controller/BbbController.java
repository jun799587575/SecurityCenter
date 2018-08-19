package com.bootdo.list.controller;



import org.apache.shiro.authz.annotation.RequiresPermissions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 21:00:36
 */

@Controller
@RequestMapping("/list/lister")
public class BbbController {


	@GetMapping()
	@RequiresPermissions("list:lister:lister")
	String Lister(){
	    return "list/lister/lister";
	}




	@GetMapping("/fractionto")
	@RequiresPermissions("list:lister:fractionto")
	String fractionto(){
		return "list/lister/fractionto";
	}




	@GetMapping("/add")
	@RequiresPermissions("list:lister:add")
	String add(){
	    return "list/lister/add";
	}


}
