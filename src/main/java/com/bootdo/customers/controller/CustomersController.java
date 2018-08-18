package com.bootdo.customers.controller;

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

import com.bootdo.customers.domain.CustomersDO;
import com.bootdo.customers.service.CustomersService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 16:20:27
 */
 
@Controller
@RequestMapping("/system/customers")
public class CustomersController {
	@Autowired
	private CustomersService customersService;
	
	@GetMapping()
	@RequiresPermissions("system:customers:customers")
	String Customers(){
	    return "system/customers/customers";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:customers:customers")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CustomersDO> customersList = customersService.list(query);
		int total = customersService.count(query);
		PageUtils pageUtils = new PageUtils(customersList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:customers:add")
	String add(){
	    return "system/customers/add";
	}

	@GetMapping("/edit/{contractId}")
	@RequiresPermissions("system:customers:edit")
	String edit(@PathVariable("contractId") Integer contractId,Model model){
		CustomersDO customers = customersService.get(contractId);
		model.addAttribute("customers", customers);
	    return "system/customers/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:customers:add")
	public R save( CustomersDO customers){
		if(customersService.save(customers)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:customers:edit")
	public R update( CustomersDO customers){
		customersService.update(customers);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:customers:remove")
	public R remove( Integer contractId){
		if(customersService.remove(contractId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:customers:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] contractIds){
		customersService.batchRemove(contractIds);
		return R.ok();
	}
	
}
