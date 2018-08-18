package com.bootdo.report.controller;

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

import com.bootdo.report.domain.ReportDO;
import com.bootdo.report.service.ReportService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 14:19:13
 */
 
@Controller
@RequestMapping("/system/report")
public class ReportController {
	@Autowired
	private ReportService reportService;
	
	@GetMapping()
	@RequiresPermissions("system:report:report")
	String Report(){
	    return "system/report/report";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:report:report")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		System.out.println("params = " + params);
        Query query = new Query(params);
		System.out.println("query = " + query);
		List<ReportDO> reportList = reportService.list(query);
		int total = reportService.count(query);
		PageUtils pageUtils = new PageUtils(reportList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:report:add")
	String add(){
	    return "system/report/add";
	}

	@GetMapping("/edit/{contractId}")
	@RequiresPermissions("system:report:edit")
	String edit(@PathVariable("contractId") Integer contractId,Model model){
		ReportDO report = reportService.get(contractId);
		model.addAttribute("report", report);
	    return "system/report/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:report:add")
	public R save( ReportDO report){
		if(reportService.save(report)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:report:edit")
	public R update( ReportDO report){
		reportService.update(report);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:report:remove")
	public R remove( Integer contractId){
		if(reportService.remove(contractId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:report:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] contractIds){
		reportService.batchRemove(contractIds);
		return R.ok();
	}
	
}
