package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.ManageDO;
import com.bootdo.system.service.ManageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:05
 */
 
@Controller
@RequestMapping("/system/manage")
public class ManageController {
	@Autowired
	private ManageService manageService;
	
	@GetMapping()
	@RequiresPermissions("system:manage:manage")
	String Manage(){
	    return "system/manage/manage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:manage:manage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ManageDO> manageList = manageService.list(query);
		int total = manageService.count(query);
		PageUtils pageUtils = new PageUtils(manageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:manage:add")
	String add(){
	    return "system/manage/add";
	}

	@GetMapping("/edit/{serveId}")
	@RequiresPermissions("system:manage:edit")
	String edit(@PathVariable("serveId") String serveId,Model model){
		ManageDO manage = manageService.get(serveId);
		model.addAttribute("manage", manage);
	    return "system/manage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:manage:add")
	public R save( ManageDO manage){
		if(manageService.save(manage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:manage:edit")
	public R update( ManageDO manage){
		manageService.update(manage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:manage:remove")
	public R remove( String serveId){
		if(manageService.remove(serveId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:manage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] serveIds){
		manageService.batchRemove(serveIds);
		return R.ok();
	}
	
}
