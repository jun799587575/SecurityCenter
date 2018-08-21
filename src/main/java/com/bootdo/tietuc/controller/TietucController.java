package com.bootdo.tietuc.controller;

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

import com.bootdo.tietuc.domain.TietucDO;
import com.bootdo.tietuc.service.TietucService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:47:21
 */
 
@Controller
@RequestMapping("/system/tietuc")
public class TietucController {
	@Autowired
	private TietucService tietucService;
	
	@GetMapping()
	@RequiresPermissions("system:tietuc:tietuc")
	String Tietuc(){
	    return "system/tietuc/tietuc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietuc:tietuc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietucDO> tietucList = tietucService.list(query);
		int total = tietucService.count(query);
		PageUtils pageUtils = new PageUtils(tietucList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietuc:add")
	String add(){
	    return "system/tietuc/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietuc:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietucDO tietuc = tietucService.get(id);
		model.addAttribute("tietuc", tietuc);
	    return "system/tietuc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietuc:add")
	public R save( TietucDO tietuc){
		if(tietucService.save(tietuc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietuc:edit")
	public R update( TietucDO tietuc){
		tietucService.update(tietuc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietuc:remove")
	public R remove( Integer id){
		if(tietucService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietuc:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietucService.batchRemove(ids);
		return R.ok();
	}
	
}
