package com.bootdo.engineer.controller;

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

import com.bootdo.engineer.domain.EngineerDO;
import com.bootdo.engineer.service.EngineerService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 09:59:46
 */
 
@Controller
@RequestMapping("/system/engineer")
public class EngineerController {
	@Autowired
	private EngineerService engineerService;
	
	@GetMapping()
	@RequiresPermissions("system:engineer:engineer")
	String Engineer(){
	    return "system/engineer/engineer";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:engineer:engineer")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EngineerDO> engineerList = engineerService.list(query);
		int total = engineerService.count(query);
		PageUtils pageUtils = new PageUtils(engineerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:engineer:add")
	String add(){
	    return "system/engineer/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:engineer:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		EngineerDO engineer = engineerService.get(id);
		model.addAttribute("engineer", engineer);
	    return "system/engineer/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:engineer:add")
	public R save( EngineerDO engineer){
		if(engineerService.save(engineer)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:engineer:edit")
	public R update( EngineerDO engineer){
		engineerService.update(engineer);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:engineer:remove")
	public R remove( Integer id){
		if(engineerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:engineer:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		engineerService.batchRemove(ids);
		return R.ok();
	}
	
}
