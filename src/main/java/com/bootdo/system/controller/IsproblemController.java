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

import com.bootdo.system.domain.IsproblemDO;
import com.bootdo.system.service.IsproblemService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:14:01
 */
 
@Controller
@RequestMapping("/system/isproblem")
public class IsproblemController {
	@Autowired
	private IsproblemService isproblemService;

	@GetMapping()
	@RequiresPermissions("system:isproblem:isproblem")
	String Allotproblem(){
		return "system/isproblem/isproblem";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:isproblem:isproblem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IsproblemDO> isproblemList = isproblemService.list(query);
		int total = isproblemService.count(query);
		PageUtils pageUtils = new PageUtils(isproblemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:isproblem:add")
	String add(){
	    return "system/isproblem/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:isproblem:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		IsproblemDO isproblem = isproblemService.get(queId);
		model.addAttribute("isproblem", isproblem);
	    return "system/isproblem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:isproblem:add")
	public R save( IsproblemDO isproblem){
		if(isproblemService.save(isproblem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:isproblem:edit")
	public R update( IsproblemDO isproblem){
		isproblemService.update(isproblem);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:isproblem:remove")
	public R remove( Integer queId){
		if(isproblemService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:isproblem:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		isproblemService.batchRemove(queIds);
		return R.ok();
	}
	
}
