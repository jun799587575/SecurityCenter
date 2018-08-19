package com.bootdo.complaintc.controller;

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

import com.bootdo.complaintc.domain.ComplaintcDO;
import com.bootdo.complaintc.service.ComplaintcService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:43:31
 */
 
@Controller
@RequestMapping("/system/complaintc")
public class ComplaintcController {
	@Autowired
	private ComplaintcService complaintcService;
	
	@GetMapping()
	@RequiresPermissions("system:complaintc:complaintc")
	String Complaintc(){
	    return "system/complaintc/complaintc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:complaintc:complaintc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintcDO> complaintcList = complaintcService.list(query);
		int total = complaintcService.count(query);
		PageUtils pageUtils = new PageUtils(complaintcList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:complaintc:add")
	String add(){
	    return "system/complaintc/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:complaintc:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ComplaintcDO complaintc = complaintcService.get(id);
		model.addAttribute("complaintc", complaintc);
	    return "system/complaintc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:complaintc:add")
	public R save( ComplaintcDO complaintc){
		if(complaintcService.save(complaintc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:complaintc:edit")
	public R update( ComplaintcDO complaintc){
		complaintcService.update(complaintc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:complaintc:remove")
	public R remove( Integer id){
		if(complaintcService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:complaintc:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		complaintcService.batchRemove(ids);
		return R.ok();
	}
	
}
