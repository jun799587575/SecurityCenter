package com.bootdo.yhnj.controller;

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

import com.bootdo.yhnj.domain.JhgkDO;
import com.bootdo.yhnj.service.JhgkService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:54:42
 */
 
@Controller
@RequestMapping("/yhnj/jhgk")
public class JhgkController {
	@Autowired
	private JhgkService jhgkService;
	
	@GetMapping()
	@RequiresPermissions("yhnj:jhgk:jhgk")
	String Jhgk(){
	    return "yhnj/jhgk/jhgk";
	}

	@GetMapping("/xiangss")
	@RequiresPermissions("yhnj:jhgk:xiangss")
	String xiangss(){
		return "yhnj/jhgk/xiangss";
	}
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("yhnj:jhgk:jhgk")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<JhgkDO> jhgkList = jhgkService.list(query);
		int total = jhgkService.count(query);
		PageUtils pageUtils = new PageUtils(jhgkList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("yhnj:jhgk:add")
	String add(){
	    return "yhnj/jhgk/add";
	}

	@GetMapping("/edit/{asd}")
	@RequiresPermissions("yhnj:jhgk:edit")
	String edit(@PathVariable("asd") String asd,Model model){
		JhgkDO jhgk = jhgkService.get(asd);
		model.addAttribute("jhgk", jhgk);
	    return "yhnj/jhgk/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("yhnj:jhgk:add")
	public R save( JhgkDO jhgk){
		if(jhgkService.save(jhgk)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("yhnj:jhgk:edit")
	public R update( JhgkDO jhgk){
		jhgkService.update(jhgk);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("yhnj:jhgk:remove")
	public R remove( String asd){
		if(jhgkService.remove(asd)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("yhnj:jhgk:batchRemove")
	public R remove(@RequestParam("ids[]") String[] asds){
		jhgkService.batchRemove(asds);
		return R.ok();
	}
	
}
