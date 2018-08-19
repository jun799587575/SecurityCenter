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

import com.bootdo.system.domain.SubDO;
import com.bootdo.system.service.SubService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:08
 */
 
@Controller
@RequestMapping("/system/sub")
public class SubController {
	@Autowired
	private SubService subService;
	
	@GetMapping()
	@RequiresPermissions("system:sub:sub")
	String Sub(){
	    return "system/sub/sub";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:sub:sub")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SubDO> subList = subService.list(query);
		int total = subService.count(query);
		PageUtils pageUtils = new PageUtils(subList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:sub:add")
	String add(){
	    return "system/sub/add";
	}

	@GetMapping("/edit/{serveId}")
	@RequiresPermissions("system:sub:edit")
	String edit(@PathVariable("serveId") String serveId,Model model){
		SubDO sub = subService.get(serveId);
		model.addAttribute("sub", sub);
	    return "system/sub/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:sub:add")
	public R save( SubDO sub){
		if(subService.save(sub)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:sub:edit")
	public R update( SubDO sub){
		subService.update(sub);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:sub:remove")
	public R remove( String serveId){
		if(subService.remove(serveId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:sub:batchRemove")
	public R remove(@RequestParam("ids[]") String[] serveIds){
		subService.batchRemove(serveIds);
		return R.ok();
	}
	
}
