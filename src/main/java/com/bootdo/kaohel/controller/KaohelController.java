package com.bootdo.kaohel.controller;

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

import com.bootdo.kaohel.domain.KaohelDO;
import com.bootdo.kaohel.service.KaohelService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 22:06:27
 */
 
@Controller
@RequestMapping("/system/kaohel")
public class KaohelController {
	@Autowired
	private KaohelService kaohelService;
	
	@GetMapping()
	@RequiresPermissions("system:kaohel:kaohel")
	String Kaohel(){
	    return "system/kaohel/kaohel";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:kaohel:kaohel")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KaohelDO> kaohelList = kaohelService.list(query);
		int total = kaohelService.count(query);
		PageUtils pageUtils = new PageUtils(kaohelList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:kaohel:add")
	String add(){
	    return "system/kaohel/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:kaohel:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KaohelDO kaohel = kaohelService.get(id);
		model.addAttribute("kaohel", kaohel);
	    return "system/kaohel/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:kaohel:add")
	public R save( KaohelDO kaohel){
		if(kaohelService.save(kaohel)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:kaohel:edit")
	public R update( KaohelDO kaohel){
		kaohelService.update(kaohel);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:kaohel:remove")
	public R remove( Integer id){
		if(kaohelService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:kaohel:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		kaohelService.batchRemove(ids);
		return R.ok();
	}
	
}
