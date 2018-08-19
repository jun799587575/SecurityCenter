package com.bootdo.event.controller;

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

import com.bootdo.event.domain.ProcessingDO;
import com.bootdo.event.service.ProcessingService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:46:07
 */
 
@Controller
@RequestMapping("/event/processing")
public class ProcessingController {
	@Autowired
	private ProcessingService processingService;
	
	@GetMapping()
	@RequiresPermissions("event:processing:processing")
	String Processing(){
	    return "event/processing/processing";
	}

	@GetMapping("/handle")
	@RequiresPermissions("event:processing:handle")
	String handle(){
		return "event/processing/handle";
	}

	@GetMapping("/task")
	@RequiresPermissions("event:processing:task")
	String task(){
		return "event/processing/task";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("event:processing:processing")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ProcessingDO> processingList = processingService.list(query);
		int total = processingService.count(query);
		PageUtils pageUtils = new PageUtils(processingList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("event:processing:add")
	String add(){
	    return "event/processing/add";
	}

	@GetMapping("/edit/{eventId}")
	@RequiresPermissions("event:processing:edit")
	String edit(@PathVariable("eventId") Integer eventId,Model model){
		ProcessingDO processing = processingService.get(eventId);
		model.addAttribute("processing", processing);
	    return "event/processing/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("event:processing:add")
	public R save( ProcessingDO processing){
		if(processingService.save(processing)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("event:processing:edit")
	public R update( ProcessingDO processing){
		processingService.update(processing);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("event:processing:remove")
	public R remove( Integer eventId){
		if(processingService.remove(eventId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("event:processing:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] eventIds){
		processingService.batchRemove(eventIds);
		return R.ok();
	}
	
}
