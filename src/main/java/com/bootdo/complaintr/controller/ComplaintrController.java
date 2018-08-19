package com.bootdo.complaintr.controller;

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

import com.bootdo.complaintr.domain.ComplaintrDO;
import com.bootdo.complaintr.service.ComplaintrService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 11:19:14
 */
 
@Controller
@RequestMapping("/system/complaintr")
public class ComplaintrController {
	@Autowired
	private ComplaintrService complaintrService;
	
	@GetMapping()
	@RequiresPermissions("system:complaintr:complaintr")
	String Complaintr(){
	    return "system/complaintr/complaintr";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:complaintr:complaintr")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintrDO> complaintrList = complaintrService.list(query);
		int total = complaintrService.count(query);
		PageUtils pageUtils = new PageUtils(complaintrList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:complaintr:add")
	String add(){
	    return "system/complaintr/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:complaintr:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ComplaintrDO complaintr = complaintrService.get(id);
		model.addAttribute("complaintr", complaintr);
	    return "system/complaintr/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:complaintr:add")
	public R save( ComplaintrDO complaintr){
		if(complaintrService.save(complaintr)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:complaintr:edit")
	public R update( ComplaintrDO complaintr){
		complaintrService.update(complaintr);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:complaintr:remove")
	public R remove( Integer id){
		if(complaintrService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:complaintr:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		complaintrService.batchRemove(ids);
		return R.ok();
	}
	
}
