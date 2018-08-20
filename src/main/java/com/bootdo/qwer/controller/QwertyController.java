package com.bootdo.qwer.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.qwer.domain.QwertyDO;
import com.bootdo.qwer.service.QwertyService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 19:58:05
 */
 
@Controller
@RequestMapping("/qwer/qwer")
public class QwertyController {
	@Autowired
	private QwertyService qwerService;
	
	@GetMapping()
	@RequiresPermissions("qwer:qwer:qwer")
	String Qwer(){
	    return "qwer/qwer/qwer";
	}


	@GetMapping("/fenpei")
	@RequiresPermissions("qwer:qwer:fenpei")
	String fenpei(){
		return "qwer/qwer/fenpei";
	}

	@GetMapping("/xiangqing")
	@RequiresPermissions("qwer:qwer:xiangqing")
	String xiangqing(){
		return "qwer/qwer/xiangqing";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("qwer:qwer:qwer")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<QwertyDO> qwerList = qwerService.list(query);
		int total = qwerService.count(query);
		PageUtils pageUtils = new PageUtils(qwerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("qwer:qwer:add")
	String add(){
	    return "qwer/qwer/add";
	}

	@GetMapping("/edit/{sda}")
	@RequiresPermissions("qwer:qwer:edit")
	String edit(@PathVariable("sda") String sda,Model model){
		QwertyDO qwer = qwerService.get(sda);
		model.addAttribute("qwer", qwer);
	    return "qwer/qwer/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("qwer:qwer:add")
	public R save( QwertyDO qwer){
		if(qwerService.save(qwer)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("qwer:qwer:edit")
	public R update( QwertyDO qwer){
		qwerService.update(qwer);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("qwer:qwer:remove")
	public R remove( String sda){
		if(qwerService.remove(sda)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("qwer:qwer:batchRemove")
	public R remove(@RequestParam("ids[]") String[] sdas){
		qwerService.batchRemove(sdas);
		return R.ok();
	}
	
}
