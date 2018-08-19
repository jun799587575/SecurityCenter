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

import com.bootdo.system.domain.AllotproblemDO;
import com.bootdo.system.service.AllotproblemService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:08:46
 */
 
@Controller
@RequestMapping("/system/allotproblem")
public class AllotproblemController {
	@Autowired
	private AllotproblemService allotproblemService;
	
	@GetMapping()
	@RequiresPermissions("system:allotproblem:allotproblem")
	String Allotproblem(){
	    return "system/allotproblem/allotproblem";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:allotproblem:allotproblem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AllotproblemDO> allotproblemList = allotproblemService.list(query);
		int total = allotproblemService.count(query);
		PageUtils pageUtils = new PageUtils(allotproblemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:allotproblem:add")
	String add(){
	    return "system/allotproblem/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:allotproblem:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		AllotproblemDO allotproblem = allotproblemService.get(queId);
		model.addAttribute("allotproblem", allotproblem);
	    return "system/allotproblem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:allotproblem:add")
	public R save( AllotproblemDO allotproblem){
		if(allotproblemService.save(allotproblem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:allotproblem:edit")
	public R update( AllotproblemDO allotproblem){
		allotproblemService.update(allotproblem);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:allotproblem:remove")
	public R remove( Integer queId){
		if(allotproblemService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:allotproblem:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		allotproblemService.batchRemove(queIds);
		return R.ok();
	}
	
}
