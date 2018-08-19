package com.bootdo.kaohe.controller;

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

import com.bootdo.kaohe.domain.KaoheDO;
import com.bootdo.kaohe.service.KaoheService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 16:21:26
 */
 
@Controller
@RequestMapping("/system/kaohe")
public class KaoheController {
	@Autowired
	private KaoheService kaoheService;
	
	@GetMapping()
	@RequiresPermissions("system:kaohe:kaohe")
	String Kaohe(){
	    return "system/kaohe/kaohe";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:kaohe:kaohe")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KaoheDO> kaoheList = kaoheService.list(query);
		int total = kaoheService.count(query);
		PageUtils pageUtils = new PageUtils(kaoheList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:kaohe:add")
	String add(){
	    return "system/kaohe/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:kaohe:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KaoheDO kaohe = kaoheService.get(id);
		model.addAttribute("kaohe", kaohe);
	    return "system/kaohe/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:kaohe:add")
	public R save( KaoheDO kaohe){
		if(kaoheService.save(kaohe)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:kaohe:edit")
	public R update( KaoheDO kaohe){
		kaoheService.update(kaohe);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:kaohe:remove")
	public R remove( Integer id){
		if(kaoheService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:kaohe:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		kaoheService.batchRemove(ids);
		return R.ok();
	}
	
}
