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

import com.bootdo.system.domain.ProblemDO;
import com.bootdo.system.service.ProblemService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 13:57:03
 */
 
@Controller
@RequestMapping("/system/problem")
public class ProblemController {
	@Autowired
	private ProblemService problemService;
	
	@GetMapping()
	@RequiresPermissions("system:problem:problem")
	String Problem(){
	    return "system/problem/problem";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:problem:problem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ProblemDO> problemList = problemService.list(query);
		int total = problemService.count(query);
		PageUtils pageUtils = new PageUtils(problemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:problem:add")
	String add(){
	    return "system/problem/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:problem:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		ProblemDO problem = problemService.get(queId);
		model.addAttribute("problem", problem);
	    return "system/problem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:problem:add")
	public R save( ProblemDO problem){
		if(problemService.save(problem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:problem:edit")
	public R update( ProblemDO problem){
		problemService.update(problem);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:problem:remove")
	public R remove( Integer queId){
		if(problemService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:problem:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		problemService.batchRemove(queIds);
		return R.ok();
	}
	
}
