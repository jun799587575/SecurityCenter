package com.bootdo.tietug.controller;

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

import com.bootdo.tietug.domain.TietugDO;
import com.bootdo.tietug.service.TietugService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:39:27
 */
 
@Controller
@RequestMapping("/system/tietug")
public class TietugController {
	@Autowired
	private TietugService tietugService;
	
	@GetMapping()
	@RequiresPermissions("system:tietug:tietug")
	String Tietug(){
	    return "system/tietug/tietug";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietug:tietug")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietugDO> tietugList = tietugService.list(query);
		int total = tietugService.count(query);
		PageUtils pageUtils = new PageUtils(tietugList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietug:add")
	String add(){
	    return "system/tietug/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietug:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietugDO tietug = tietugService.get(id);
		model.addAttribute("tietug", tietug);
	    return "system/tietug/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietug:add")
	public R save( TietugDO tietug){
		if(tietugService.save(tietug)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietug:edit")
	public R update( TietugDO tietug){
		tietugService.update(tietug);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietug:remove")
	public R remove( Integer id){
		if(tietugService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietug:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietugService.batchRemove(ids);
		return R.ok();
	}
	
}
