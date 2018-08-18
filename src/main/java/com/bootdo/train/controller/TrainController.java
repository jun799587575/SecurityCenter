package com.bootdo.train.controller;

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

import com.bootdo.train.domain.TrainDO;
import com.bootdo.train.service.TrainService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 02:16:58
 */
 
@Controller
@RequestMapping("/system/train")
public class TrainController {
	@Autowired
	private TrainService trainService;
	
	@GetMapping()
	@RequiresPermissions("system:train:train")
	String Train(){
	    return "system/train/train";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:train:train")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TrainDO> trainList = trainService.list(query);
		int total = trainService.count(query);
		PageUtils pageUtils = new PageUtils(trainList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:train:add")
	String add(){
	    return "system/train/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:train:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TrainDO train = trainService.get(id);
		model.addAttribute("train", train);
	    return "system/train/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:train:add")
	public R save( TrainDO train){
		if(trainService.save(train)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:train:edit")
	public R update( TrainDO train){
		trainService.update(train);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:train:remove")
	public R remove( Integer id){
		if(trainService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:train:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		trainService.batchRemove(ids);
		return R.ok();
	}
	
}
