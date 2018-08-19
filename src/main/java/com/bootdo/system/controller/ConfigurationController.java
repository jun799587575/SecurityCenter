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

import com.bootdo.system.domain.ConfigurationDO;
import com.bootdo.system.service.ConfigurationService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:37
 */
 
@Controller
@RequestMapping("/system/configuration")
public class ConfigurationController {
	@Autowired
	private ConfigurationService configurationService;
	
	@GetMapping()
	@RequiresPermissions("system:configuration:configuration")
	String Configuration(){
	    return "system/configuration/configuration";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:configuration:configuration")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ConfigurationDO> configurationList = configurationService.list(query);
		int total = configurationService.count(query);
		PageUtils pageUtils = new PageUtils(configurationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:configuration:add")
	String add(){
	    return "system/configuration/add";
	}

	@GetMapping("/edit/{itemId}")
	@RequiresPermissions("system:configuration:edit")
	String edit(@PathVariable("itemId") Integer itemId,Model model){
		ConfigurationDO configuration = configurationService.get(itemId);
		model.addAttribute("configuration", configuration);
	    return "system/configuration/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:configuration:add")
	public R save( ConfigurationDO configuration){
		if(configurationService.save(configuration)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:configuration:edit")
	public R update( ConfigurationDO configuration){
		configurationService.update(configuration);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:configuration:remove")
	public R remove( Integer itemId){
		if(configurationService.remove(itemId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:configuration:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] itemIds){
		configurationService.batchRemove(itemIds);
		return R.ok();
	}
	
}
