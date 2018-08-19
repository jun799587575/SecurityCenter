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

import com.bootdo.system.domain.AmanageDO;
import com.bootdo.system.service.AmanageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:38
 */
 
@Controller
@RequestMapping("/system/amanage")
public class AmanageController {
	@Autowired
	private AmanageService amanageService;
	
	@GetMapping()
	@RequiresPermissions("system:amanage:amanage")
	String Amanage(){
	    return "system/amanage/amanage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:amanage:amanage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AmanageDO> amanageList = amanageService.list(query);
		int total = amanageService.count(query);
		PageUtils pageUtils = new PageUtils(amanageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:amanage:add")
	String add(){
	    return "system/amanage/add";
	}

	@GetMapping("/edit/{slaId}")
	@RequiresPermissions("system:amanage:edit")
	String edit(@PathVariable("slaId") String slaId,Model model){
		AmanageDO amanage = amanageService.get(slaId);
		model.addAttribute("amanage", amanage);
	    return "system/amanage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:amanage:add")
	public R save( AmanageDO amanage){
		if(amanageService.save(amanage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:amanage:edit")
	public R update( AmanageDO amanage){
		amanageService.update(amanage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:amanage:remove")
	public R remove( String slaId){
		if(amanageService.remove(slaId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:amanage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] slaIds){
		amanageService.batchRemove(slaIds);
		return R.ok();
	}
	
}
