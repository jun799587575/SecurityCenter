package com.bootdo.tietuf.controller;

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

import com.bootdo.tietuf.domain.TietufDO;
import com.bootdo.tietuf.service.TietufService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:27:47
 */
 
@Controller
@RequestMapping("/system/tietuf")
public class TietufController {
	@Autowired
	private TietufService tietufService;
	
	@GetMapping()
	@RequiresPermissions("system:tietuf:tietuf")
	String Tietuf(){
	    return "system/tietuf/tietuf";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietuf:tietuf")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietufDO> tietufList = tietufService.list(query);
		int total = tietufService.count(query);
		PageUtils pageUtils = new PageUtils(tietufList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietuf:add")
	String add(){
	    return "system/tietuf/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietuf:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietufDO tietuf = tietufService.get(id);
		model.addAttribute("tietuf", tietuf);
	    return "system/tietuf/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietuf:add")
	public R save( TietufDO tietuf){
		if(tietufService.save(tietuf)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietuf:edit")
	public R update( TietufDO tietuf){
		tietufService.update(tietuf);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietuf:remove")
	public R remove( Integer id){
		if(tietufService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietuf:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietufService.batchRemove(ids);
		return R.ok();
	}
	
}
