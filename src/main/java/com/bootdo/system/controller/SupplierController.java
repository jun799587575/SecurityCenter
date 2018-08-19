package com.bootdo.system.controller;

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

import com.bootdo.system.domain.SupplierDO;
import com.bootdo.system.service.SupplierService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:20
 */
 
@Controller
@RequestMapping("/system/supplier")
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping()
	@RequiresPermissions("system:supplier:supplier")
	String Supplier(){
	    return "system/supplier/supplier";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:supplier:supplier")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SupplierDO> supplierList = supplierService.list(query);
		int total = supplierService.count(query);
		PageUtils pageUtils = new PageUtils(supplierList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:supplier:add")
	String add(){
	    return "system/supplier/add";
	}

	@GetMapping("/edit/{conId}")
	@RequiresPermissions("system:supplier:edit")
	String edit(@PathVariable("conId") Integer conId,Model model){
		SupplierDO supplier = supplierService.get(conId);
		model.addAttribute("supplier", supplier);
	    return "system/supplier/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:supplier:add")
	public R save( SupplierDO supplier){
		if(supplierService.save(supplier)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:supplier:edit")
	public R update( SupplierDO supplier){
		supplierService.update(supplier);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:supplier:remove")
	public R remove( Integer conId){
		if(supplierService.remove(conId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:supplier:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] conIds){
		supplierService.batchRemove(conIds);
		return R.ok();
	}
	
}
