package com.bootdo.kaohes.controller;

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

import com.bootdo.kaohes.domain.KaohesDO;
import com.bootdo.kaohes.service.KaohesService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 21:32:33
 */
 
@Controller
@RequestMapping("/system/kaohes")
public class KaohesController {
	@Autowired
	private KaohesService kaohesService;
	
	@GetMapping()
	@RequiresPermissions("system:kaohes:kaohes")
	String Kaohes(){
	    return "system/kaohes/kaohes";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:kaohes:kaohes")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KaohesDO> kaohesList = kaohesService.list(query);
		int total = kaohesService.count(query);
		PageUtils pageUtils = new PageUtils(kaohesList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:kaohes:add")
	String add(){
	    return "system/kaohes/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:kaohes:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KaohesDO kaohes = kaohesService.get(id);
		model.addAttribute("kaohes", kaohes);
	    return "system/kaohes/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:kaohes:add")
	public R save( KaohesDO kaohes){
		if(kaohesService.save(kaohes)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:kaohes:edit")
	public R update( KaohesDO kaohes){
		kaohesService.update(kaohes);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:kaohes:remove")
	public R remove( Integer id){
		if(kaohesService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:kaohes:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		kaohesService.batchRemove(ids);
		return R.ok();
	}
	
}
