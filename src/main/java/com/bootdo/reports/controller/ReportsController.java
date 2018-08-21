package com.bootdo.reports.controller;

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

import com.bootdo.reports.domain.ReportsDO;
import com.bootdo.reports.service.ReportsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:44:33
 */
 
@Controller
@RequestMapping("/system/reports")
public class ReportsController {
	@Autowired
	private ReportsService reportsService;
	
	@GetMapping()
	@RequiresPermissions("system:reports:reports")
	String Reports(){
	    return "system/reports/reports";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:reports:reports")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReportsDO> reportsList = reportsService.list(query);
		int total = reportsService.count(query);
		PageUtils pageUtils = new PageUtils(reportsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:reports:add")
	String add(){
	    return "system/reports/add";
	}

	@GetMapping("/edit/{contractId}")
	@RequiresPermissions("system:reports:edit")
	String edit(@PathVariable("contractId") Integer contractId,Model model){
		ReportsDO reports = reportsService.get(contractId);
		model.addAttribute("reports", reports);
	    return "system/reports/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:reports:add")
	public R save( ReportsDO reports){
		if(reportsService.save(reports)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:reports:edit")
	public R update( ReportsDO reports){
		reportsService.update(reports);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:reports:remove")
	public R remove( Integer contractId){
		if(reportsService.remove(contractId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:reports:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] contractIds){
		reportsService.batchRemove(contractIds);
		return R.ok();
	}
	
}
