package com.bootdo.complaintl.controller;

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

import com.bootdo.complaintl.domain.ComplaintlDO;
import com.bootdo.complaintl.service.ComplaintlService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:06:01
 */
 
@Controller
@RequestMapping("/system/complaintl")
public class ComplaintlController {
	@Autowired
	private ComplaintlService complaintlService;
	
	@GetMapping()
	@RequiresPermissions("system:complaintl:complaintl")
	String Complaintl(){
	    return "system/complaintl/complaintl";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:complaintl:complaintl")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintlDO> complaintlList = complaintlService.list(query);
		int total = complaintlService.count(query);
		PageUtils pageUtils = new PageUtils(complaintlList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:complaintl:add")
	String add(){
	    return "system/complaintl/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:complaintl:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ComplaintlDO complaintl = complaintlService.get(id);
		model.addAttribute("complaintl", complaintl);
	    return "system/complaintl/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:complaintl:add")
	public R save( ComplaintlDO complaintl){
		if(complaintlService.save(complaintl)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:complaintl:edit")
	public R update( ComplaintlDO complaintl){
		complaintlService.update(complaintl);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:complaintl:remove")
	public R remove( Integer id){
		if(complaintlService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:complaintl:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		complaintlService.batchRemove(ids);
		return R.ok();
	}
	
}
