package com.bootdo.plmn.controller;

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

import com.bootdo.plmn.domain.NmlpDO;
import com.bootdo.plmn.service.NmlpService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 22:46:38
 */
 
@Controller
@RequestMapping("/plmn/nmlp")
public class NmlpController {
	@Autowired
	private NmlpService nmlpService;
	
	@GetMapping("/xiang")
	@RequiresPermissions("plmn:nmlp:xiang")
	String xiang(){
	    return "plmn/nmlp/xiang";
	}

	@GetMapping("/paicheng")
	@RequiresPermissions("plmn:nmlp:paicheng")
	String paicheng(){
		return "plmn/nmlp/paicheng";
	}


	@GetMapping()
	@RequiresPermissions("plmn:nmlp:nmlp")
	String Nmlp(){
		return "plmn/nmlp/nmlp";
	}


	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("plmn:nmlp:nmlp")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<NmlpDO> nmlpList = nmlpService.list(query);
		int total = nmlpService.count(query);
		PageUtils pageUtils = new PageUtils(nmlpList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("plmn:nmlp:add")
	String add(){
	    return "plmn/nmlp/add";
	}

	@GetMapping("/edit/{asd}")
	@RequiresPermissions("plmn:nmlp:edit")
	String edit(@PathVariable("asd") String asd,Model model){
		NmlpDO nmlp = nmlpService.get(asd);
		model.addAttribute("nmlp", nmlp);
	    return "plmn/nmlp/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("plmn:nmlp:add")
	public R save( NmlpDO nmlp){
		if(nmlpService.save(nmlp)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("plmn:nmlp:edit")
	public R update( NmlpDO nmlp){
		nmlpService.update(nmlp);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("plmn:nmlp:remove")
	public R remove( String asd){
		if(nmlpService.remove(asd)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("plmn:nmlp:batchRemove")
	public R remove(@RequestParam("ids[]") String[] asds){
		nmlpService.batchRemove(asds);
		return R.ok();
	}
	
}
