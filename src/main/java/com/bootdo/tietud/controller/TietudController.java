package com.bootdo.tietud.controller;

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

import com.bootdo.tietud.domain.TietudDO;
import com.bootdo.tietud.service.TietudService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:58:39
 */
 
@Controller
@RequestMapping("/system/tietud")
public class TietudController {
	@Autowired
	private TietudService tietudService;
	
	@GetMapping()
	@RequiresPermissions("system:tietud:tietud")
	String Tietud(){
	    return "system/tietud/tietud";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietud:tietud")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietudDO> tietudList = tietudService.list(query);
		int total = tietudService.count(query);
		PageUtils pageUtils = new PageUtils(tietudList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietud:add")
	String add(){
	    return "system/tietud/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietud:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietudDO tietud = tietudService.get(id);
		model.addAttribute("tietud", tietud);
	    return "system/tietud/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietud:add")
	public R save( TietudDO tietud){
		if(tietudService.save(tietud)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietud:edit")
	public R update( TietudDO tietud){
		tietudService.update(tietud);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietud:remove")
	public R remove( Integer id){
		if(tietudService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietud:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietudService.batchRemove(ids);
		return R.ok();
	}
	
}
