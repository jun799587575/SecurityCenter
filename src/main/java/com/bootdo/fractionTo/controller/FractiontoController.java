package com.bootdo.fractionTo.controller;

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

import com.bootdo.fractionTo.domain.FractiontoDO;
import com.bootdo.fractionTo.service.FractiontoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 23:08:41
 */
 
@Controller
@RequestMapping("/system/fractionto")
public class FractiontoController {
	@Autowired
	private FractiontoService fractiontoService;
	
	@GetMapping()
	@RequiresPermissions("system:fractionto:fractionto")
	String Fractionto(){
	    return "system/fractionto/fractionto";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:fractionto:fractionto")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FractiontoDO> fractiontoList = fractiontoService.list(query);
		int total = fractiontoService.count(query);
		PageUtils pageUtils = new PageUtils(fractiontoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:fractionto:add")
	String add(){
	    return "system/fractionto/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:fractionto:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		FractiontoDO fractionto = fractiontoService.get(id);
		model.addAttribute("fractionto", fractionto);
	    return "system/fractionto/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:fractionto:add")
	public R save( FractiontoDO fractionto){
		if(fractiontoService.save(fractionto)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:fractionto:edit")
	public R update( FractiontoDO fractionto){
		fractiontoService.update(fractionto);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:fractionto:remove")
	public R remove( Integer id){
		if(fractiontoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:fractionto:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		fractiontoService.batchRemove(ids);
		return R.ok();
	}
	
}
