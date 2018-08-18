package com.bootdo.skill.controller;

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

import com.bootdo.skill.domain.SkillDO;
import com.bootdo.skill.service.SkillService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 14:56:24
 */
 
@Controller
@RequestMapping("/system/skill")
public class SkillController {
	@Autowired
	private SkillService skillService;
	
	@GetMapping()
	@RequiresPermissions("system:skill:skill")
	String Skill(){
	    return "system/skill/skill";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:skill:skill")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SkillDO> skillList = skillService.list(query);
		int total = skillService.count(query);
		PageUtils pageUtils = new PageUtils(skillList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:skill:add")
	String add(){
	    return "system/skill/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:skill:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		SkillDO skill = skillService.get(id);
		model.addAttribute("skill", skill);
	    return "system/skill/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:skill:add")
	public R save( SkillDO skill){
		if(skillService.save(skill)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:skill:edit")
	public R update( SkillDO skill){
		skillService.update(skill);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:skill:remove")
	public R remove( Integer id){
		if(skillService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:skill:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		skillService.batchRemove(ids);
		return R.ok();
	}
	
}
