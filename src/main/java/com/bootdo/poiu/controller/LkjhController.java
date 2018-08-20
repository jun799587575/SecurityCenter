package com.bootdo.poiu.controller;

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

import com.bootdo.poiu.domain.LkjhDO;
import com.bootdo.poiu.service.LkjhService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 21:30:49
 */
 
@Controller
@RequestMapping("/poiu/lkjh")
public class LkjhController {
	@Autowired
	private LkjhService lkjhService;
	
	@GetMapping()
	@RequiresPermissions("poiu:lkjh:lkjh")
	String Lkjh(){
	    return "poiu/lkjh/lkjh";
	}

	@GetMapping("/shenpi")
	@RequiresPermissions("poiu:lkjh:shenpi")
	String shenpi(){
		return "poiu/lkjh/shenpi";
	}

	@GetMapping("/xiangqingsss")
	@RequiresPermissions("poiu:lkjh:xiangqingsss")
	String xiangqingsss(){
		return "poiu/lkjh/xiangqingsss";
	}



	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("poiu:lkjh:lkjh")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LkjhDO> lkjhList = lkjhService.list(query);
		int total = lkjhService.count(query);
		PageUtils pageUtils = new PageUtils(lkjhList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("poiu:lkjh:edit")
	String add(){
	    return "poiu/lkjh/edit";
	}

	@GetMapping("/edit/{asdd}")
	@RequiresPermissions("poiu:lkjh:edit")
	String edit(@PathVariable("asdd") String asdd,Model model){
		LkjhDO lkjh = lkjhService.get(asdd);
		model.addAttribute("lkjh", lkjh);
	    return "poiu/lkjh/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("poiu:lkjh:add")
	public R save( LkjhDO lkjh){
		if(lkjhService.save(lkjh)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("poiu:lkjh:edit")
	public R update( LkjhDO lkjh){
		lkjhService.update(lkjh);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("poiu:lkjh:remove")
	public R remove( String asdd){
		if(lkjhService.remove(asdd)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("poiu:lkjh:batchRemove")
	public R remove(@RequestParam("ids[]") String[] asdds){
		lkjhService.batchRemove(asdds);
		return R.ok();
	}
	
}
