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

import com.bootdo.work.domain.KnowDO;
import com.bootdo.work.service.KnowService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 *
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:11:19
 */

@Controller
@RequestMapping("/work/know")
public class KnowController {
	@Autowired
	private KnowService knowService;


	@GetMapping("/KnowCollect")
	@RequiresPermissions("work:know:KnowCollect")
	String KnowCollect(){
		return "work/know/knowCollect";
	}

	@GetMapping()
	@RequiresPermissions("work:know:know")
	String Know(){
		return "work/know/know";
	}

	@GetMapping("/KnowReview")
	@RequiresPermissions("work:know:knowReview")
	String KnowReview(){
		return "work/know/knowReview";
	}


	@GetMapping("/KnowExamination")
	@RequiresPermissions("work:know:knowExamination")
	String KnowExamination(){
		return "work/know/knowExamination";
	}

	@GetMapping("/KnowRelease")
	@RequiresPermissions("work:know:knowRelease")
	String KnowRelease(){
		return "work/know/knowRelease";
	}



	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("work:know:know")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<KnowDO> knowList = knowService.list(query);
		int total = knowService.count(query);
		PageUtils pageUtils = new PageUtils(knowList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("work:know:add")
	String add(){
		return "work/know/add";
	}

	@GetMapping("/edit")
	@RequiresPermissions("work:know:edit")
	String edit(){
		return "work/know/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("work:know:add")
	public R save( KnowDO know){
		if(knowService.save(know)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("work:know:edit")
	public R update( KnowDO know){
		knowService.update(know);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("work:know:remove")
	public R remove( String knowKeyword){
		if(knowService.remove(knowKeyword)>0){
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("work:know:batchRemove")
	public R remove(@RequestParam("ids[]") String[] knowKeywords){
		knowService.batchRemove(knowKeywords);
		return R.ok();
	}


	@GetMapping("/ReviewOpinion")
	@RequiresPermissions("work:know:reviewOpinion")
	String ReviewOpinion(){
		return "work/know/reviewOpinion";
	}
}
