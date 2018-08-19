package com.bootdo.deploy.controller;

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

import com.bootdo.deploy.domain.NasDO;
import com.bootdo.deploy.service.NasService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:36
 */
 
@Controller
@RequestMapping("/deploy/nas")
public class NasController {
	@Autowired
	private NasService nasService;
	
	@GetMapping()
	@RequiresPermissions("deploy:nas:nas")
	String Nas(){
	    return "deploy/nas/nas";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("deploy:nas:nas")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<NasDO> nasList = nasService.list(query);
		int total = nasService.count(query);
		PageUtils pageUtils = new PageUtils(nasList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("deploy:nas:add")
	String add(){
	    return "deploy/nas/add";
	}

	@GetMapping("/edit/{nasId}")
	@RequiresPermissions("deploy:nas:edit")
	String edit(@PathVariable("nasId") Integer nasId,Model model){
		NasDO nas = nasService.get(nasId);
		model.addAttribute("nas", nas);
	    return "deploy/nas/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("deploy:nas:add")
	public R save( NasDO nas){
		if(nasService.save(nas)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("deploy:nas:edit")
	public R update( NasDO nas){
		nasService.update(nas);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("deploy:nas:remove")
	public R remove( Integer nasId){
		if(nasService.remove(nasId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("deploy:nas:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] nasIds){
		nasService.batchRemove(nasIds);
		return R.ok();
	}
	
}
