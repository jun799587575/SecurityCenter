package com.bootdo.abcd.controller;

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

import com.bootdo.abcd.domain.QwerDO;
import com.bootdo.abcd.service.QwerService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 18:15:36
 */
 
@Controller
@RequestMapping("/abcd/qwer")
public class QwerController {
	@Autowired
	private QwerService qwerService;
	
	@GetMapping()
	@RequiresPermissions("abcd:qwer:qwer")
	String Qwer(){
	    return "abcd/qwer/qwer";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("abcd:qwer:qwer")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<QwerDO> qwerList = qwerService.list(query);
		int total = qwerService.count(query);
		PageUtils pageUtils = new PageUtils(qwerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("abcd:qwer:add")
	String add(){
	    return "abcd/qwer/add";
	}

	@GetMapping("/edit/{sda}")
	@RequiresPermissions("abcd:qwer:edit")
	String edit(@PathVariable("sda") String sda,Model model){
		QwerDO qwer = qwerService.get(sda);
		model.addAttribute("qwer", qwer);
	    return "abcd/qwer/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("abcd:qwer:add")
	public R save( QwerDO qwer){
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
	@RequiresPermissions("abcd:qwer:edit")
	public R update( QwerDO qwer){
		qwerService.update(qwer);
		return R.ok();
	}

	@ResponseBody
	@RequestMapping("/resetPwd")
	@RequiresPermissions("abcd:qwer:resetPwd")
	public R resetPwd( QwerDO qwer){
		qwerService.update(qwer);
		return R.ok();
	}
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("abcd:qwer:remove")
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
	@RequiresPermissions("abcd:qwer:batchRemove")
	public R remove(@RequestParam("ids[]") String[] sdas){
		qwerService.batchRemove(sdas);
		return R.ok();
	}
	
}
