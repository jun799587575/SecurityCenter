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

import com.bootdo.system.domain.TmanageDO;
import com.bootdo.system.service.TmanageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:45
 */
 
@Controller
@RequestMapping("/system/tmanage")
public class TmanageController {
	@Autowired
	private TmanageService tmanageService;
	
	@GetMapping()
	@RequiresPermissions("system:tmanage:tmanage")
	String Tmanage(){
	    return "system/tmanage/tmanage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tmanage:tmanage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TmanageDO> tmanageList = tmanageService.list(query);
		int total = tmanageService.count(query);
		PageUtils pageUtils = new PageUtils(tmanageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tmanage:add")
	String add(){
	    return "system/tmanage/add";
	}

	@GetMapping("/edit/{sltId}")
	@RequiresPermissions("system:tmanage:edit")
	String edit(@PathVariable("sltId") String sltId,Model model){
		TmanageDO tmanage = tmanageService.get(sltId);
		model.addAttribute("tmanage", tmanage);
	    return "system/tmanage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tmanage:add")
	public R save( TmanageDO tmanage){
		if(tmanageService.save(tmanage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tmanage:edit")
	public R update( TmanageDO tmanage){
		tmanageService.update(tmanage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tmanage:remove")
	public R remove( String sltId){
		if(tmanageService.remove(sltId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tmanage:batchRemove")
	public R remove(@RequestParam("ids[]") String[] sltIds){
		tmanageService.batchRemove(sltIds);
		return R.ok();
	}
	
}
