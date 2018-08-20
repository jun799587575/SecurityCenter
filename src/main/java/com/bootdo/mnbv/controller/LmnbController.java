package com.bootdo.mnbv.controller;

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

import com.bootdo.mnbv.domain.LmnbDO;
import com.bootdo.mnbv.service.LmnbService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 22:07:31
 */
 
@Controller
@RequestMapping("/mnbv/lmnb")
public class LmnbController {
	@Autowired
	private LmnbService lmnbService;
	
	@GetMapping()
	@RequiresPermissions("mnbv:lmnb:lmnb")
	String Lmnb(){
	    return "mnbv/lmnb/lmnb";
	}

	@GetMapping("/pinggu")
	@RequiresPermissions("mnbv:lmnb:pinggu")
	String pinggu(){
		return "mnbv/lmnb/pinggu";
	}

	@GetMapping("/xiangqingssss")
	@RequiresPermissions("mnbv:lmnb:xiangqingssss")
	String xiangqingssss(){
		return "mnbv/lmnb/xiangqingssss";
	}



	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("mnbv:lmnb:lmnb")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LmnbDO> lmnbList = lmnbService.list(query);
		int total = lmnbService.count(query);
		PageUtils pageUtils = new PageUtils(lmnbList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("mnbv:lmnb:add")
	String add(){
	    return "mnbv/lmnb/add";
	}

	@GetMapping("/edit/{zxcv}")
	@RequiresPermissions("mnbv:lmnb:edit")
	String edit(@PathVariable("zxcv") String zxcv,Model model){
		LmnbDO lmnb = lmnbService.get(zxcv);
		model.addAttribute("lmnb", lmnb);
	    return "mnbv/lmnb/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("mnbv:lmnb:add")
	public R save( LmnbDO lmnb){
		if(lmnbService.save(lmnb)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("mnbv:lmnb:edit")
	public R update( LmnbDO lmnb){
		lmnbService.update(lmnb);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("mnbv:lmnb:remove")
	public R remove( String zxcv){
		if(lmnbService.remove(zxcv)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("mnbv:lmnb:batchRemove")
	public R remove(@RequestParam("ids[]") String[] zxcvs){
		lmnbService.batchRemove(zxcvs);
		return R.ok();
	}
	
}
