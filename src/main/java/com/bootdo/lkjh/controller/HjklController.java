package com.bootdo.lkjh.controller;

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

import com.bootdo.lkjh.domain.HjklDO;
import com.bootdo.lkjh.service.HjklService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:37:47
 */
 
@Controller
@RequestMapping("/lkjh/hjkl")
public class HjklController {
	@Autowired
	private HjklService hjklService;
	
	@GetMapping()
	@RequiresPermissions("lkjh:hjkl:hjkl")
	String Hjkl(){
	    return "lkjh/hjkl/hjkl";
	}

	@GetMapping("/shenhe")
	@RequiresPermissions("lkjh:hjkl:shenhe")
	String shenhe(){
		return "lkjh/hjkl/shenhe";
	}

	@GetMapping("/xiangs")
	@RequiresPermissions("lkjh:hjkl:xiangs")
	String xiangs(){
		return "lkjh/hjkl/xiangs";
	}



	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("lkjh:hjkl:hjkl")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HjklDO> hjklList = hjklService.list(query);
		int total = hjklService.count(query);
		PageUtils pageUtils = new PageUtils(hjklList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("lkjh:hjkl:add")
	String add(){
	    return "lkjh/hjkl/add";
	}

	@GetMapping("/edit/{asd}")
	@RequiresPermissions("lkjh:hjkl:edit")
	String edit(@PathVariable("asd") String asd,Model model){
		HjklDO hjkl = hjklService.get(asd);
		model.addAttribute("hjkl", hjkl);
	    return "lkjh/hjkl/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("lkjh:hjkl:add")
	public R save( HjklDO hjkl){
		if(hjklService.save(hjkl)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("lkjh:hjkl:edit")
	public R update( HjklDO hjkl){
		hjklService.update(hjkl);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("lkjh:hjkl:remove")
	public R remove( String asd){
		if(hjklService.remove(asd)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("lkjh:hjkl:batchRemove")
	public R remove(@RequestParam("ids[]") String[] asds){
		hjklService.batchRemove(asds);
		return R.ok();
	}
	
}
