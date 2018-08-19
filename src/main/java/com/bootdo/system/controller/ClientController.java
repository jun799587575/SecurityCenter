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

import com.bootdo.system.domain.ClientDO;
import com.bootdo.system.service.ClientService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:18
 */
 
@Controller
@RequestMapping("/system/client")
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping()
	@RequiresPermissions("system:client:client")
	String Client(){
	    return "system/client/client";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:client:client")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ClientDO> clientList = clientService.list(query);
		int total = clientService.count(query);
		PageUtils pageUtils = new PageUtils(clientList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:client:add")
	String add(){
	    return "system/client/add";
	}

	@GetMapping("/edit/{conId}")
	@RequiresPermissions("system:client:edit")
	String edit(@PathVariable("conId") Integer conId,Model model){
		ClientDO client = clientService.get(conId);
		model.addAttribute("client", client);
	    return "system/client/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:client:add")
	public R save( ClientDO client){
		if(clientService.save(client)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:client:edit")
	public R update( ClientDO client){
		clientService.update(client);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:client:remove")
	public R remove( Integer conId){
		if(clientService.remove(conId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:client:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] conIds){
		clientService.batchRemove(conIds);
		return R.ok();
	}
	
}
