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

import com.bootdo.system.domain.PointDO;
import com.bootdo.system.service.PointService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 13:35:27
 */
 
@Controller
@RequestMapping("/system/point")
public class PointController {
	@Autowired
	private PointService pointService;
	
	@GetMapping()
	@RequiresPermissions("system:point:point")
	String Point(){
	    return "system/point/point";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:point:point")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PointDO> pointList = pointService.list(query);
		int total = pointService.count(query);
		PageUtils pageUtils = new PageUtils(pointList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:point:add")
	String add(){
	    return "system/point/add";
	}

	@GetMapping("/edit/{queId}")
	@RequiresPermissions("system:point:edit")
	String edit(@PathVariable("queId") Integer queId,Model model){
		PointDO point = pointService.get(queId);
		model.addAttribute("point", point);
	    return "system/point/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:point:add")
	public R save( PointDO point){
		if(pointService.save(point)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:point:edit")
	public R update( PointDO point){
		pointService.update(point);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:point:remove")
	public R remove( Integer queId){
		if(pointService.remove(queId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:point:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] queIds){
		pointService.batchRemove(queIds);
		return R.ok();
	}
	
}
