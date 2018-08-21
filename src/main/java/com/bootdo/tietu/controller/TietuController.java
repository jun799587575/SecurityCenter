package com.bootdo.tietu.controller;

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

import com.bootdo.tietu.domain.TietuDO;
import com.bootdo.tietu.service.TietuService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:02:17
 */
 
@Controller
@RequestMapping("/system/tietu")
public class TietuController {
	@Autowired
	private TietuService tietuService;
	
	@GetMapping()
	@RequiresPermissions("system:tietu:tietu")
	String Tietu(){
	    return "system/tietu/tietu";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietu:tietu")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietuDO> tietuList = tietuService.list(query);
		int total = tietuService.count(query);
		PageUtils pageUtils = new PageUtils(tietuList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietu:add")
	String add(){
	    return "system/tietu/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietu:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietuDO tietu = tietuService.get(id);
		model.addAttribute("tietu", tietu);
	    return "system/tietu/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietu:add")
	public R save( TietuDO tietu){
		if(tietuService.save(tietu)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietu:edit")
	public R update( TietuDO tietu){
		tietuService.update(tietu);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietu:remove")
	public R remove( Integer id){
		if(tietuService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietu:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietuService.batchRemove(ids);
		return R.ok();
	}
	
}
