package com.bootdo.reportl.controller;

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

import com.bootdo.reportl.domain.ReportslDO;
import com.bootdo.reportl.service.ReportslService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-20 00:10:28
 */
 
@Controller
@RequestMapping("/system/reportsl")
public class ReportslController {
	@Autowired
	private ReportslService reportslService;
	
	@GetMapping()
	@RequiresPermissions("system:reportsl:reportsl")
	String Reportsl(){
	    return "system/reportsl/reportsl";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:reportsl:reportsl")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReportslDO> reportslList = reportslService.list(query);
		int total = reportslService.count(query);
		PageUtils pageUtils = new PageUtils(reportslList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:reportsl:add")
	String add(){
	    return "system/reportsl/add";
	}

	@GetMapping("/edit/{contractId}")
	@RequiresPermissions("system:reportsl:edit")
	String edit(@PathVariable("contractId") Integer contractId,Model model){
		ReportslDO reportsl = reportslService.get(contractId);
		model.addAttribute("reportsl", reportsl);
	    return "system/reportsl/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:reportsl:add")
	public R save( ReportslDO reportsl){
		if(reportslService.save(reportsl)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:reportsl:edit")
	public R update( ReportslDO reportsl){
		reportslService.update(reportsl);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:reportsl:remove")
	public R remove( Integer contractId){
		if(reportslService.remove(contractId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:reportsl:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] contractIds){
		reportslService.batchRemove(contractIds);
		return R.ok();
	}
	
}
