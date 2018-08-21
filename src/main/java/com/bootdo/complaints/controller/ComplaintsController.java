package com.bootdo.complaints.controller;

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

import com.bootdo.complaints.domain.ComplaintsDO;
import com.bootdo.complaints.service.ComplaintsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 09:28:43
 */
 
@Controller
@RequestMapping("/system/complaints")
public class ComplaintsController {
	@Autowired
	private ComplaintsService complaintsService;
	
	@GetMapping()
	@RequiresPermissions("system:complaints:complaints")
	String Complaints(){
	    return "system/complaints/complaints";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:complaints:complaints")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintsDO> complaintsList = complaintsService.list(query);
		int total = complaintsService.count(query);
		PageUtils pageUtils = new PageUtils(complaintsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:complaints:add")
	String add(){
	    return "system/complaints/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:complaints:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ComplaintsDO complaints = complaintsService.get(id);
		model.addAttribute("complaints", complaints);
	    return "system/complaints/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:complaints:add")
	public R save( ComplaintsDO complaints){
		if(complaintsService.save(complaints)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:complaints:edit")
	public R update( ComplaintsDO complaints){
		complaintsService.update(complaints);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:complaints:remove")
	public R remove( Integer id){
		if(complaintsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:complaints:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		complaintsService.batchRemove(ids);
		return R.ok();
	}
	
}
