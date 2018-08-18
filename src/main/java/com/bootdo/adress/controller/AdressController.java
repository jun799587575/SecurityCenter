package com.bootdo.adress.controller;

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

import com.bootdo.adress.domain.AdressDO;
import com.bootdo.adress.service.AdressService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:09:01
 */
 
@Controller
@RequestMapping("/system/adress")
public class AdressController {
	@Autowired
	private AdressService adressService;
	
	@GetMapping()
	@RequiresPermissions("system:adress:adress")
	String Adress(){
	    return "system/adress/adress";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:adress:adress")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdressDO> adressList = adressService.list(query);
		int total = adressService.count(query);
		PageUtils pageUtils = new PageUtils(adressList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:adress:add")
	String add(){
	    return "system/adress/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:adress:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AdressDO adress = adressService.get(id);
		model.addAttribute("adress", adress);
	    return "system/adress/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:adress:add")
	public R save( AdressDO adress){
		if(adressService.save(adress)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:adress:edit")
	public R update( AdressDO adress){
		adressService.update(adress);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:adress:remove")
	public R remove( Integer id){
		if(adressService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:adress:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		adressService.batchRemove(ids);
		return R.ok();
	}
	
}
