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

import com.bootdo.deploy.domain.IpDO;
import com.bootdo.deploy.service.IpService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:35
 */
 
@Controller
@RequestMapping("/deploy/ip")
public class IpController {
	@Autowired
	private IpService ipService;
	
	@GetMapping()
	@RequiresPermissions("deploy:ip:ip")
	String Ip(){
	    return "deploy/ip/ip";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("deploy:ip:ip")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IpDO> ipList = ipService.list(query);
		int total = ipService.count(query);
		PageUtils pageUtils = new PageUtils(ipList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("deploy:ip:add")
	String add(){
	    return "deploy/ip/add";
	}

	@GetMapping("/edit/{ipId}")
	@RequiresPermissions("deploy:ip:edit")
	String edit(@PathVariable("ipId") Integer ipId,Model model){
		IpDO ip = ipService.get(ipId);
		model.addAttribute("ip", ip);
	    return "deploy/ip/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("deploy:ip:add")
	public R save( IpDO ip){
		if(ipService.save(ip)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("deploy:ip:edit")
	public R update( IpDO ip){
		ipService.update(ip);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("deploy:ip:remove")
	public R remove( Integer ipId){
		if(ipService.remove(ipId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("deploy:ip:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ipIds){
		ipService.batchRemove(ipIds);
		return R.ok();
	}
	
}
