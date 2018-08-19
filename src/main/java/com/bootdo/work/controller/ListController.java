package com.bootdo.work.controller;

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

import com.bootdo.work.domain.ListDO;
import com.bootdo.work.service.ListService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author jundada
 * @email 1992lcg@163.com
 * @date 2018-08-14 16:06:13
 */
 
@Controller
@RequestMapping("/work/list")
public class ListController {
	@Autowired
	private ListService listService;
	
	@GetMapping()
	@RequiresPermissions("work:list:list")
	String List(){
	    return "work/list/list";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("work:list:list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ListDO> listList = listService.list(query);
		int total = listService.count(query);
		PageUtils pageUtils = new PageUtils(listList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("work:list:add")
	String add(){
	    return "work/list/add";
	}

	@GetMapping("/close")
	@RequiresPermissions("work:list:close")
	String close(){
		return "work/list/close";
	}


	@GetMapping("/edit/{workId}")
	@RequiresPermissions("work:list:edit")
	String edit(@PathVariable("workId") String workId,Model model){
		ListDO list = listService.get(workId);
		model.addAttribute("list", list);
	    return "work/list/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("work:list:add")
	public R save( ListDO list){
		if(listService.save(list)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("work:list:edit")
	public R update( ListDO list){
		listService.update(list);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("work:list:remove")
	public R remove( String workId){
		if(listService.remove(workId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("work:list:batchRemove")
	public R remove(@RequestParam("ids[]") String[] workIds){
		listService.batchRemove(workIds);
		return R.ok();
	}
	
}
