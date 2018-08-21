package com.bootdo.tietub.controller;

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

import com.bootdo.tietub.domain.TietubDO;
import com.bootdo.tietub.service.TietubService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:28:37
 */
 
@Controller
@RequestMapping("/system/tietub")
public class TietubController {
	@Autowired
	private TietubService tietubService;
	
	@GetMapping()
	@RequiresPermissions("system:tietub:tietub")
	String Tietub(){
	    return "system/tietub/tietub";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietub:tietub")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietubDO> tietubList = tietubService.list(query);
		int total = tietubService.count(query);
		PageUtils pageUtils = new PageUtils(tietubList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietub:add")
	String add(){
	    return "system/tietub/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietub:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietubDO tietub = tietubService.get(id);
		model.addAttribute("tietub", tietub);
	    return "system/tietub/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietub:add")
	public R save( TietubDO tietub){
		if(tietubService.save(tietub)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietub:edit")
	public R update( TietubDO tietub){
		tietubService.update(tietub);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietub:remove")
	public R remove( Integer id){
		if(tietubService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietub:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietubService.batchRemove(ids);
		return R.ok();
	}
	
}
