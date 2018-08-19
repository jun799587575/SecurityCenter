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

import com.bootdo.system.domain.RepairDO;
import com.bootdo.system.service.RepairService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 11:39:41
 */
 
@Controller
@RequestMapping("/system/repair")
public class RepairController {
	@Autowired
	private RepairService repairService;
	
	@GetMapping()
	@RequiresPermissions("system:repair:repair")
	String Repair(){
	    return "system/repair/repair";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:repair:repair")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RepairDO> repairList = repairService.list(query);
		int total = repairService.count(query);
		PageUtils pageUtils = new PageUtils(repairList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:repair:add")
	String add(){
	    return "system/repair/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:repair:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		RepairDO repair = repairService.get(queId);
		model.addAttribute("repair", repair);
	    return "system/repair/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:repair:add")
	public R save( RepairDO repair){
		if(repairService.save(repair)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:repair:edit")
	public R update( RepairDO repair){
		repairService.update(repair);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:repair:remove")
	public R remove( Integer queId){
		if(repairService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:repair:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		repairService.batchRemove(queIds);
		return R.ok();
	}
	
}
