package com.bootdo.tietua.controller;

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

import com.bootdo.tietua.domain.TietuaDO;
import com.bootdo.tietua.service.TietuaService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:13:25
 */
 
@Controller
@RequestMapping("/system/tietua")
public class TietuaController {
	@Autowired
	private TietuaService tietuaService;
	
	@GetMapping()
	@RequiresPermissions("system:tietua:tietua")
	String Tietua(){
	    return "system/tietua/tietua";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:tietua:tietua")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TietuaDO> tietuaList = tietuaService.list(query);
		int total = tietuaService.count(query);
		PageUtils pageUtils = new PageUtils(tietuaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:tietua:add")
	String add(){
	    return "system/tietua/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:tietua:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TietuaDO tietua = tietuaService.get(id);
		model.addAttribute("tietua", tietua);
	    return "system/tietua/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:tietua:add")
	public R save( TietuaDO tietua){
		if(tietuaService.save(tietua)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:tietua:edit")
	public R update( TietuaDO tietua){
		tietuaService.update(tietua);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:tietua:remove")
	public R remove( Integer id){
		if(tietuaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:tietua:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tietuaService.batchRemove(ids);
		return R.ok();
	}
	
}
