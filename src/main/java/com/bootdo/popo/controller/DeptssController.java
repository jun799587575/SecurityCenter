package com.bootdo.popo.controller;


import com.bootdo.common.utils.R;
import com.bootdo.kaohe.domain.KaoheDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 部门管理
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 16:15:41
 */
 
@Controller
@RequestMapping("/popo/dept")
public class DeptssController {

	@GetMapping("/haven")
	@RequiresPermissions("popo:dept:haven")
	String haven(){
	    return "popo/dept/haven";
	}

	@GetMapping("/cooperation")
	@RequiresPermissions("popo:dept:cooperation")
	String cooperation(){
		return "popo/dept/cooperation";
	}

	@GetMapping("/total")
	@RequiresPermissions("popo:dept:total")
	String total(){
		return "popo/dept/total";
	}

	@GetMapping()
	@RequiresPermissions("popo:dept:dept")
	String Dept(){
		return "popo/dept/dept";
	}


	
	@GetMapping("/add")
	@RequiresPermissions("popo:dept:add")
	String add(){
	    return "popo/dept/add";
	}

}
