package com.bootdo.deploy.controller;

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

import com.bootdo.deploy.domain.PcDO;
import com.bootdo.deploy.service.PcService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:37
 */
 
@Controller
@RequestMapping("/deploy/pc")
public class PcController {
	@Autowired
	private PcService pcService;
	
	@GetMapping()
	@RequiresPermissions("deploy:pc:pc")
	String Pc(){
	    return "deploy/pc/pc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("deploy:pc:pc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PcDO> pcList = pcService.list(query);
		int total = pcService.count(query);
		PageUtils pageUtils = new PageUtils(pcList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("deploy:pc:add")
	String add(){
	    return "deploy/pc/add";
	}

	@GetMapping("/edit/{pcId}")
	@RequiresPermissions("deploy:pc:edit")
	String edit(@PathVariable("pcId") Integer pcId,Model model){
		PcDO pc = pcService.get(pcId);
		model.addAttribute("pc", pc);
	    return "deploy/pc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("deploy:pc:add")
	public R save( PcDO pc){
		if(pcService.save(pc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("deploy:pc:edit")
	public R update( PcDO pc){
		pcService.update(pc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("deploy:pc:remove")
	public R remove( Integer pcId){
		if(pcService.remove(pcId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("deploy:pc:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] pcIds){
		pcService.batchRemove(pcIds);
		return R.ok();
	}
	
}
