package com.bootdo.kaohet.controller;

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

import com.bootdo.kaohet.domain.KaohetDO;
import com.bootdo.kaohet.service.KaohetService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 23:02:26
 */
 
@Controller
@RequestMapping("/system/kaohet")
public class KaohetController {
	@Autowired
	private KaohetService kaohetService;
	
	@GetMapping()
	@RequiresPermissions("system:kaohet:kaohet")
	String Kaohet(){
	    return "system/kaohet/kaohet";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:kaohet:kaohet")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KaohetDO> kaohetList = kaohetService.list(query);
		int total = kaohetService.count(query);
		PageUtils pageUtils = new PageUtils(kaohetList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:kaohet:add")
	String add(){
	    return "system/kaohet/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:kaohet:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KaohetDO kaohet = kaohetService.get(id);
		model.addAttribute("kaohet", kaohet);
	    return "system/kaohet/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:kaohet:add")
	public R save( KaohetDO kaohet){
		if(kaohetService.save(kaohet)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:kaohet:edit")
	public R update( KaohetDO kaohet){
		kaohetService.update(kaohet);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:kaohet:remove")
	public R remove( Integer id){
		if(kaohetService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:kaohet:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		kaohetService.batchRemove(ids);
		return R.ok();
	}
	
}
