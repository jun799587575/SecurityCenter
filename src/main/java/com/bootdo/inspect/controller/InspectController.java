package com.bootdo.inspect.controller;

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

import com.bootdo.inspect.domain.InspectDO;
import com.bootdo.inspect.service.InspectService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:35:08
 */
 
@Controller
@RequestMapping("/inspect/inspect")
public class InspectController {
	@Autowired
	private InspectService inspectService;
	
	@GetMapping()
	@RequiresPermissions("inspect:inspect:inspect")
	String Inspect(){
	    return "inspect/inspect/inspect";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inspect:inspect:inspect")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<InspectDO> inspectList = inspectService.list(query);
		int total = inspectService.count(query);
		PageUtils pageUtils = new PageUtils(inspectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inspect:inspect:add")
	String add(){
	    return "inspect/inspect/add";
	}

	@GetMapping("/edit/{inspectId}")
	@RequiresPermissions("inspect:inspect:edit")
	String edit(@PathVariable("inspectId") Integer inspectId,Model model){
		InspectDO inspect = inspectService.get(inspectId);
		model.addAttribute("inspect", inspect);
	    return "inspect/inspect/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inspect:inspect:add")
	public R save( InspectDO inspect){
		if(inspectService.save(inspect)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inspect:inspect:edit")
	public R update( InspectDO inspect){
		inspectService.update(inspect);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inspect:inspect:remove")
	public R remove( Integer inspectId){
		if(inspectService.remove(inspectId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inspect:inspect:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] inspectIds){
		inspectService.batchRemove(inspectIds);
		return R.ok();
	}
	
}
