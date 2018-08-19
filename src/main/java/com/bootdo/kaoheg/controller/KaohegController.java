package com.bootdo.kaoheg.controller;

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

import com.bootdo.kaoheg.domain.KaohegDO;
import com.bootdo.kaoheg.service.KaohegService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 22:39:37
 */
 
@Controller
@RequestMapping("/system/kaoheg")
public class KaohegController {
	@Autowired
	private KaohegService kaohegService;
	
	@GetMapping()
	@RequiresPermissions("system:kaoheg:kaoheg")
	String Kaoheg(){
	    return "system/kaoheg/kaoheg";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:kaoheg:kaoheg")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KaohegDO> kaohegList = kaohegService.list(query);
		int total = kaohegService.count(query);
		PageUtils pageUtils = new PageUtils(kaohegList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:kaoheg:add")
	String add(){
	    return "system/kaoheg/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:kaoheg:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KaohegDO kaoheg = kaohegService.get(id);
		model.addAttribute("kaoheg", kaoheg);
	    return "system/kaoheg/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:kaoheg:add")
	public R save( KaohegDO kaoheg){
		if(kaohegService.save(kaoheg)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:kaoheg:edit")
	public R update( KaohegDO kaoheg){
		kaohegService.update(kaoheg);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:kaoheg:remove")
	public R remove( Integer id){
		if(kaohegService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:kaoheg:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		kaohegService.batchRemove(ids);
		return R.ok();
	}
	
}
