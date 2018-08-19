package com.bootdo.system.controller;

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

import com.bootdo.system.domain.CancelDO;
import com.bootdo.system.service.CancelService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 12:21:39
 */
 
@Controller
@RequestMapping("/system/cancel")
public class CancelController {
	@Autowired
	private CancelService cancelService;
	
	@GetMapping()
	@RequiresPermissions("system:cancel:cancel")
	String Cancel(){
	    return "system/cancel/cancel";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:cancel:cancel")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CancelDO> cancelList = cancelService.list(query);
		int total = cancelService.count(query);
		PageUtils pageUtils = new PageUtils(cancelList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:cancel:add")
	String add(){
	    return "system/cancel/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:cancel:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		CancelDO cancel = cancelService.get(queId);
		model.addAttribute("cancel", cancel);
	    return "system/cancel/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:cancel:add")
	public R save( CancelDO cancel){
		if(cancelService.save(cancel)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:cancel:edit")
	public R update( CancelDO cancel){
		cancelService.update(cancel);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:cancel:remove")
	public R remove( Integer queId){
		if(cancelService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:cancel:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		cancelService.batchRemove(queIds);
		return R.ok();
	}
	
}
