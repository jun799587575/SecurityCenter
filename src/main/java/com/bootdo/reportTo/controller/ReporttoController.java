package com.bootdo.reportTo.controller;

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

import com.bootdo.reportTo.domain.ReporttoDO;
import com.bootdo.reportTo.service.ReporttoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 19:07:21
 */
 
@Controller
@RequestMapping("/system/reportto")
public class ReporttoController {
	@Autowired
	private ReporttoService reporttoService;
	
	@GetMapping()
	@RequiresPermissions("system:reportto:reportto")
	String Reportto(){
	    return "system/reportto/reportto";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:reportto:reportto")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReporttoDO> reporttoList = reporttoService.list(query);
		int total = reporttoService.count(query);
		PageUtils pageUtils = new PageUtils(reporttoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:reportto:add")
	String add(){
	    return "system/reportto/add";
	}

	@GetMapping("/edit/{contractId}")
	@RequiresPermissions("system:reportto:edit")
	String edit(@PathVariable("contractId") Integer contractId,Model model){
		ReporttoDO reportto = reporttoService.get(contractId);
		model.addAttribute("reportto", reportto);
	    return "system/reportto/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:reportto:add")
	public R save( ReporttoDO reportto){
		if(reporttoService.save(reportto)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:reportto:edit")
	public R update( ReporttoDO reportto){
		reporttoService.update(reportto);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:reportto:remove")
	public R remove( Integer contractId){
		if(reporttoService.remove(contractId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:reportto:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] contractIds){
		reporttoService.batchRemove(contractIds);
		return R.ok();
	}
	
}
