package com.bootdo.tietue.controller;

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

import com.bootdo.tietue.domain.TietueDO;
import com.bootdo.tietue.service.TietueService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:16:12
 */
 
@Controller
@RequestMapping("/system/tietue")
public class TietueController {
	@Autowired
	private TietueService tietueService;
	
	@GetMapping()
	@RequiresPermissions("system:tietue:tietue")
	String Tietue(){
	    return "system/tietue/tietue";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietue:tietue")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietueDO> tietueList = tietueService.list(query);
		int total = tietueService.count(query);
		PageUtils pageUtils = new PageUtils(tietueList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietue:add")
	String add(){
	    return "system/tietue/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietue:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietueDO tietue = tietueService.get(id);
		model.addAttribute("tietue", tietue);
	    return "system/tietue/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietue:add")
	public R save( TietueDO tietue){
		if(tietueService.save(tietue)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietue:edit")
	public R update( TietueDO tietue){
		tietueService.update(tietue);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietue:remove")
	public R remove( Integer id){
		if(tietueService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietue:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietueService.batchRemove(ids);
		return R.ok();
	}
	
}
