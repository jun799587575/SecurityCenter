package com.bootdo.fraction.controller;

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

import com.bootdo.fraction.domain.FractionDO;
import com.bootdo.fraction.service.FractionService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:45:59
 */
 
@Controller
@RequestMapping("/system/fraction")
public class FractionController {
	@Autowired
	private FractionService fractionService;
	
	@GetMapping()
	@RequiresPermissions("system:fraction:fraction")
	String Fraction(){
	    return "system/fraction/fraction";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:fraction:fraction")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FractionDO> fractionList = fractionService.list(query);
		int total = fractionService.count(query);
		PageUtils pageUtils = new PageUtils(fractionList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:fraction:add")
	String add(){
	    return "system/fraction/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:fraction:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		FractionDO fraction = fractionService.get(id);
		model.addAttribute("fraction", fraction);
	    return "system/fraction/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:fraction:add")
	public R save( FractionDO fraction){
		if(fractionService.save(fraction)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:fraction:edit")
	public R update( FractionDO fraction){
		fractionService.update(fraction);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:fraction:remove")
	public R remove( Integer id){
		if(fractionService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:fraction:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		fractionService.batchRemove(ids);
		return R.ok();
	}
	
}
