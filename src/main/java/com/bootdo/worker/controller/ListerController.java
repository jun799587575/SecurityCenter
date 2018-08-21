package com.bootdo.worker.controller;

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

import com.bootdo.worker.domain.ListerDO;
import com.bootdo.worker.service.ListerService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:04:31
 */
 
@Controller
@RequestMapping("/worker/lister")
public class ListerController {
	@Autowired
	private ListerService listerService;
	
	@GetMapping("/sla")
	@RequiresPermissions("worker:lister:sla")
	String sla(){
	    return "worker/lister/sla";
	}

	@GetMapping("/agency")
	@RequiresPermissions("worker:lister:agency")
	String agency(){
		return "worker/lister/agency";
	}

	@GetMapping("/suoyou")
	@RequiresPermissions("worker:lister:suoyou")
	String suoyou(){
		return "worker/lister/suoyou";
	}

	@GetMapping("/jieshou")
	@RequiresPermissions("worker:lister:suoyou")
	String jieshou(){
		return "worker/lister/jieshou";
	}

	@GetMapping("/chuli")
	@RequiresPermissions("worker:lister:suoyou")
	String chuli(){
		return "worker/lister/chuli";
	}

	@GetMapping("/havedone")
	@RequiresPermissions("worker:lister:havedone")
	String havedone(){
		return "worker/lister/havedone";
	}

	@GetMapping()
	@RequiresPermissions("worker:lister:lister")
	String Lister(){
		return "worker/lister/lister";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("worker:lister:lister")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ListerDO> listerList = listerService.list(query);
		int total = listerService.count(query);
		PageUtils pageUtils = new PageUtils(listerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("worker:lister:add")
	String add(){
	    return "worker/lister/add";
	}

	@GetMapping("/edit/{workId}")
	@RequiresPermissions("worker:lister:edit")
	String edit(@PathVariable("workId") Integer workId,Model model){
		ListerDO lister = listerService.get(workId);
		model.addAttribute("lister", lister);
	    return "worker/lister/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("worker:lister:add")
	public R save( ListerDO lister){
		if(listerService.save(lister)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("worker:lister:edit")
	public R update( ListerDO lister){
		listerService.update(lister);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("worker:lister:remove")
	public R remove( Integer workId){
		if(listerService.remove(workId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("worker:lister:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] workIds){
		listerService.batchRemove(workIds);
		return R.ok();
	}
	
}
