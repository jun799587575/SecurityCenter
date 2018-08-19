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

import com.bootdo.system.domain.SolveDO;
import com.bootdo.system.service.SolveService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 12:04:01
 */
 
@Controller
@RequestMapping("/system/solve")
public class SolveController {
	@Autowired
	private SolveService solveService;
	
	@GetMapping()
	@RequiresPermissions("system:solve:solve")
	String Solve(){
	    return "system/solve/solve";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:solve:solve")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SolveDO> solveList = solveService.list(query);
		int total = solveService.count(query);
		PageUtils pageUtils = new PageUtils(solveList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:solve:add")
	String add(){
	    return "system/solve/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:solve:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		SolveDO solve = solveService.get(queId);
		model.addAttribute("solve", solve);
	    return "system/solve/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:solve:add")
	public R save( SolveDO solve){
		if(solveService.save(solve)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:solve:edit")
	public R update( SolveDO solve){
		solveService.update(solve);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:solve:remove")
	public R remove( Integer queId){
		if(solveService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:solve:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		solveService.batchRemove(queIds);
		return R.ok();
	}
	
}
