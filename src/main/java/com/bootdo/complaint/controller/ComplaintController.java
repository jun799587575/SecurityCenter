package com.bootdo.complaint.controller;

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

import com.bootdo.complaint.domain.ComplaintDO;
import com.bootdo.complaint.service.ComplaintService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 14:51:40
 */
 
@Controller
@RequestMapping("/system/complaint")
public class ComplaintController {
	@Autowired
	private ComplaintService complaintService;
	
	@GetMapping()
	@RequiresPermissions("system:complaint:complaint")
	String Complaint(){
	    return "system/complaint/complaint";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:complaint:complaint")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据42423
        Query query = new Query(params);
		List<ComplaintDO> complaintList = complaintService.list(query);
		int total = complaintService.count(query);
		PageUtils pageUtils = new PageUtils(complaintList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:complaint:add")
	String add(){
	    return "system/complaint/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:complaint:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ComplaintDO complaint = complaintService.get(id);
		model.addAttribute("complaint", complaint);
	    return "system/complaint/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:complaint:add")
	public R save( ComplaintDO complaint){
		if(complaintService.save(complaint)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:complaint:edit")
	public R update( ComplaintDO complaint){
		complaintService.update(complaint);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:complaint:remove")
	public R remove( Integer id){
		if(complaintService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:complaint:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		complaintService.batchRemove(ids);
		return R.ok();
	}
	
}
