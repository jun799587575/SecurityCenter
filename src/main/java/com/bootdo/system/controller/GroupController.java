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

import com.bootdo.system.domain.GroupDO;
import com.bootdo.system.service.GroupService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:19:38
 */
 
@Controller
@RequestMapping("/system/group")
public class GroupController {
	@Autowired
	private GroupService groupService;
	
	@GetMapping()
	@RequiresPermissions("system:group:group")
	String Group(){
	    return "system/group/group";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:group:group")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GroupDO> groupList = groupService.list(query);
		int total = groupService.count(query);
		PageUtils pageUtils = new PageUtils(groupList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:group:add")
	String add(){
	    return "system/group/add";
	}

	@GetMapping("/edit/{serveId}")
	@RequiresPermissions("system:group:edit")
	String edit(@PathVariable("serveId") String serveId,Model model){
		GroupDO group = groupService.get(serveId);
		model.addAttribute("group", group);
	    return "system/group/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:group:add")
	public R save( GroupDO group){
		if(groupService.save(group)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:group:edit")
	public R update( GroupDO group){
		groupService.update(group);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:group:remove")
	public R remove( String serveId){
		if(groupService.remove(serveId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:group:batchRemove")
	public R remove(@RequestParam("ids[]") String[] serveIds){
		groupService.batchRemove(serveIds);
		return R.ok();
	}
	
}
