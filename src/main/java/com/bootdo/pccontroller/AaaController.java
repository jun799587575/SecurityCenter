package com.bootdo.pccontroller;


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
@RequestMapping("modify/pc")
public class AaaController {


	@GetMapping()
	@RequiresPermissions("modify:pc:pc")
	String Lister(){
	    return "modify/pc/pc";
	}


	@GetMapping("/aaa")
	@RequiresPermissions("modify:pc:aaa")
	String aaa(){
		return "modify/pc/aaa";
	}


	@GetMapping("/bbb")
	@RequiresPermissions("modify:pc:bbb")
	String bbb(){
		return "modify/pc/bbb";
	}


	@GetMapping("/ccc")
	@RequiresPermissions("modify:pc:ccc")
	String ccc(){
		return "modify/pc/ccc";
	}


	@GetMapping("/ddd")
	@RequiresPermissions("modify:pc:ddd")
	String ddd(){
		return "modify/pc/ddd";
	}

	@GetMapping("/ddds")
	@RequiresPermissions("modify:pc:ddds")
	String ddds(){
		return "modify/pc/ddds";
	}

	@GetMapping("/eee")
	@RequiresPermissions("modify:pc:eee")
	String eee(){
		return "modify/pc/eee";
	}

	@GetMapping("/fff")
	@RequiresPermissions("modify:pc:fff")
	String fff(){
		return "modify/pc/fff";
	}









//	modify:pc:add
//
//	modify/pc/add



	@GetMapping("/add")
	@RequiresPermissions("modify:pc:add")
	String add(){
	    return "modify/pc/add";
	}


}
