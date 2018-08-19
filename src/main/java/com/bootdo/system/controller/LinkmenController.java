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

import com.bootdo.system.domain.LinkmenDO;
import com.bootdo.system.service.LinkmenService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:40
 */
 
@Controller
@RequestMapping("/system/linkmen")
public class LinkmenController {
	@Autowired
	private LinkmenService linkmenService;
	
	@GetMapping()
	@RequiresPermissions("system:linkmen:linkmen")
	String Linkmen(){
	    return "system/linkmen/linkmen";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:linkmen:linkmen")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LinkmenDO> linkmenList = linkmenService.list(query);
		int total = linkmenService.count(query);
		PageUtils pageUtils = new PageUtils(linkmenList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:linkmen:add")
	String add(){
	    return "system/linkmen/add";
	}

	@GetMapping("/edit/{linId}")
	@RequiresPermissions("system:linkmen:edit")
	String edit(@PathVariable("linId") Integer linId,Model model){
		LinkmenDO linkmen = linkmenService.get(linId);
		model.addAttribute("linkmen", linkmen);
	    return "system/linkmen/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:linkmen:add")
	public R save( LinkmenDO linkmen){
		if(linkmenService.save(linkmen)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:linkmen:edit")
	public R update( LinkmenDO linkmen){
		linkmenService.update(linkmen);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:linkmen:remove")
	public R remove( Integer linId){
		if(linkmenService.remove(linId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:linkmen:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] linIds){
		linkmenService.batchRemove(linIds);
		return R.ok();
	}
	
}
